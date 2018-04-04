/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author byron
 */
public class Loan{

    //atributos
    private String uidStudent;
    private String serieMaterial;
    private String date, date2;
    private int penalty;
    private boolean returned;

    //costructores
    public Loan() {
        this.uidStudent = "";
        this.serieMaterial = "";
        this.date = "";
        this.date2 = "";
        this.penalty =0;
        this.returned = false;

    }

    public Loan(String uidStudent, String serieMaterial, String date, String date2) {
        this.uidStudent = uidStudent;
        this.serieMaterial = serieMaterial;
        this.date = date;
        this.date2 = date2;
        this.penalty = 0;
        this.returned = false;
    }

    //sets, gets y toString
    public String getUidStudent() {
        return uidStudent;
    }

    public void setUidStudent(String uidStudent) {
        this.uidStudent = uidStudent;
    }

    public String getSerieMaterial() {
        return serieMaterial;
    }

    public void setSerieMaterial(String serieMaterial) {
        this.serieMaterial = serieMaterial;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty=penalty;
    }
    

    public boolean getReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
    
      //metodo que responda el tamano de las variables de la clase
    public int tamano() {
        return this.uidStudent.length() *2+ this.serieMaterial.length() *2 + this.date.length() * 2 + this.date2.length() * 2;
    }
    
    public int penaltyFee(){
        int penaltyFee=0;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date inicialDate=dateFormat.parse(this.date);
            Date finalDate=dateFormat.parse(this.date2);
            int days = (int)((finalDate.getTime()-inicialDate.getTime())/86400000);
            if(days<0){
                penaltyFee = days*-200;
            }
            else{
                penaltyFee = 0;
            }
        } catch (ParseException ex) {
            Logger.getLogger(Loan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return penaltyFee;
    }
    
    public int days(){
        int days = 0;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date inicialDate=dateFormat.parse(this.date);
            Date finalDate=dateFormat.parse(this.date2);
            days = (int)((finalDate.getTime()-inicialDate.getTime())/86400000);
            
        } catch (ParseException ex) {
            Logger.getLogger(Loan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return days;
    }

    @Override
    public String toString() {
        return "Loan{" + "student=" + uidStudent + ", material=" + serieMaterial + ", date=" + date + ", date2=" + date2 + '}';
    }
}
