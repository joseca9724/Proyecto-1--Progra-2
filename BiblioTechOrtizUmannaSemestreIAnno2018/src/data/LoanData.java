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

    private ArrayList<Loan> listaDeJugadoresRegistrados;

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

    //guarda los prestamos
    private boolean saveLoan(int posicion, Loan loan) throws IOException {

        if (posicion >= 0 && posicion <= this.regsQuantity) {
            if (loan.size() > this.regSize) {
                return false;
            } else {
                this.randomAccessFile.seek(posicion * this.regSize);
                this.randomAccessFile.writeUTF(loan.getUidStudent());
                this.randomAccessFile.writeUTF(loan.getSerieMaterial());
                this.randomAccessFile.writeUTF(loan.getDate());
                this.randomAccessFile.writeUTF(loan.getDate2());

                return true;
            }
        }
        return false;
    } 

    //asigna la posicion para escribir despues del ultimo elemento del archivo
    public boolean insertLoan(Loan objeto) throws IOException {
        return saveLoan(this.regsQuantity, objeto);
    } // insertLoan

    //recupera un prestamo segun el uid y serie que se ingrese
    public Loan readLoan(Loan objeto, String uid, String serie) throws IOException {
        loanList();
        objeto = new Loan();

        for (int i = 0; i < this.listaDeJugadoresRegistrados.size(); i++) {
            if (this.listaDeJugadoresRegistrados.get(i).getUidStudent().equalsIgnoreCase(uid)) {
                if (this.listaDeJugadoresRegistrados.get(i).getSerieMaterial().equalsIgnoreCase(serie)) {
                    objeto = this.listaDeJugadoresRegistrados.get(i);
                }
            }
        }//for

        return objeto;

    }//obtenerJugador

    //guarda en una lista todos los prestamos
    public ArrayList<Loan> loanList() throws IOException {
        this.listaDeJugadoresRegistrados = new ArrayList<Loan>();

        for (int i = 0; i < this.regsQuantity; i++) {
            this.randomAccessFile.seek(i * this.regSize);

            Loan loan = new Loan();
            loan.setUidStudent(this.randomAccessFile.readUTF());
            loan.setSerieMaterial(this.randomAccessFile.readUTF());
            loan.setDate(this.randomAccessFile.readUTF());
            loan.setDate2(this.randomAccessFile.readUTF());

            this.listaDeJugadoresRegistrados.add(loan);
        }//for//for
        return listaDeJugadoresRegistrados;
    }//listaJugadores
}
