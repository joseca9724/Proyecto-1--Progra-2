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

    private Student student;
    private Material material;
    private String date, date2;

    public Loan() {
        this.student = null;
        this.material = null;
        this.date = "";
        this.date2 = "";

    }

    public Loan(Student student, Material material, String date, String date2) {
        this.student = student;
        this.material = material;
        this.date = date;
        this.date2 = date2;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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

    @Override
    public String toString() {
        return "Loan{" + "student=" + student + ", material=" + material + ", date=" + date + ", date2=" + date2 + '}';
    }
    
    

}
