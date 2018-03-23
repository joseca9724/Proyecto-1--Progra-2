/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author byron
 */
public class Loan {

    //atributos
    private String uidStudent;
    private String serieMaterial;
    private String date, date2;
    private double multa;

    //costructores
    public Loan() {
        this.uidStudent = null;
        this.serieMaterial = null;
        this.date = "";
        this.date2 = "";
        this.multa = 0;

    }

    public Loan(String uidStudent, String serieMaterial, String date, String date2) {
        this.uidStudent = uidStudent;
        this.serieMaterial = serieMaterial;
        this.date = date;
        this.date2 = date2;
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

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    
      //metodo que responda el tamano de las variables de la clase
    public int size() {
        return (int) 10 + 10 + this.date.length() * 2 + this.date2.length() * 2;
    }

    @Override
    public String toString() {
        return "Loan{" + "student=" + uidStudent + ", material=" + serieMaterial + ", date=" + date + ", date2=" + date2 + '}';
    }
}
