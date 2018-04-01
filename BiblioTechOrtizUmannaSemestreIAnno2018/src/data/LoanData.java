/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Loan;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class LoanData {

    //atributos
    public RandomAccessFile randomAccessFile;
    private int regSize, regsQuantity; //tamano del registro, cantidad de registros
    private String path;//ruta
    File file;

    private ArrayList<Loan> RegisteredLoanList;

    //Constructor
    public LoanData() throws IOException {
        this.path = "Loans.dad";
        this.file = new File(this.path);
        start(file);

    }

    //crea el archivo
    private void start(File file) throws IOException {
        this.path = file.getPath();
        this.regSize = 200;

        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName() + "archivo invalido");
        } else {
            this.randomAccessFile = new RandomAccessFile(file, "rw");
            this.regsQuantity = (int) Math.ceil((double) this.randomAccessFile.length() / (double) this.regSize);
        }//else
    }//start
    
    public void close() throws IOException{
        randomAccessFile.close();
    }
    
    public int fileSize(){
        return this.regsQuantity;
    }
    

    //guarda los prestamos
    public boolean saveLoan(int position, Loan loan) throws IOException {

        if (position >= 0 && position <= regsQuantity) {
            if (loan.tamano() > regSize) {
                System.err.println("1002 - Record size is out of bounds");
            } else {
                this.randomAccessFile.seek(position * this.regSize);
                this.randomAccessFile.writeUTF(loan.getUidStudent());
                this.randomAccessFile.writeUTF(loan.getSerieMaterial());
                this.randomAccessFile.writeUTF(loan.getDate());
                this.randomAccessFile.writeUTF(loan.getDate2());
                this.randomAccessFile.writeBoolean(loan.getReturned());

                return true;
            }
        } else {
            System.err.println("1001 - Record position is out of bounds");
        }
        return false;
    }

    //asigna la posicion para escribir despues del ultimo elemento del archivo
    public void insertLoan(Loan objeto) throws IOException {
        if(saveLoan(this.regsQuantity, objeto)){
            regsQuantity++;
        }
    } // insertLoan

    //recupera un prestamo segun el uid y serie que se ingrese
    public Loan readLoan(Loan objeto, String uid, String serie) throws IOException {
        loanList();
        objeto = new Loan();

        for (int i = 0; i < this.RegisteredLoanList.size(); i++) {
            if (this.RegisteredLoanList.get(i).getUidStudent().equalsIgnoreCase(uid)) {
                if (this.RegisteredLoanList.get(i).getSerieMaterial().equalsIgnoreCase(serie)) {
                    objeto = this.RegisteredLoanList.get(i);
                }
            }
        }//for

        return objeto;

    }//obtenerJugador
    
    public void updatedLoan(String uid, String serie) throws IOException {
        this.RegisteredLoanList=loanList();
        Loan loan = new Loan();

        for (int i = 0; i < this.RegisteredLoanList.size(); i++) {
            if (this.RegisteredLoanList.get(i).getUidStudent().equalsIgnoreCase(uid)) {
                if (this.RegisteredLoanList.get(i).getSerieMaterial().equalsIgnoreCase(serie)) {
                    loan = this.RegisteredLoanList.get(i);
                    System.out.println(loan);
                    loan.setReturned(true);
                    saveLoan(i, loan);
                }
            }
        }//for
    }
    

    //guarda en una lista todos los prestamos
    public ArrayList<Loan> loanList() throws IOException {
        this.RegisteredLoanList = new ArrayList<Loan>();

        for (int i = 0; i < fileSize(); i++) {
            this.randomAccessFile.seek(i * this.regSize);

            Loan loan = new Loan();
            loan.setUidStudent(this.randomAccessFile.readUTF());
            loan.setSerieMaterial(this.randomAccessFile.readUTF());
            loan.setDate(this.randomAccessFile.readUTF());
            loan.setDate2(this.randomAccessFile.readUTF());
            loan.setReturned(this.randomAccessFile.readBoolean());

            this.RegisteredLoanList.add(loan);
        }//for//for
        return RegisteredLoanList;
    }//listaJugadores
}
