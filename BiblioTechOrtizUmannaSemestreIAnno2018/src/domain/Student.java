/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author byron
 */
public class Student implements Serializable {

    //atributos
    private String name, lastName, career;
    private int cantStudents, year;

    //costructores
    public Student() {
        this.name = "";
        this.lastName = "";
        this.career = "";
        this.cantStudents = 0;
        this.year = 0;
    }

    public Student(String name, String lastName, String career, int cantStudents, int year) {
        this.name = name;
        this.lastName = lastName;
        this.cantStudents = cantStudents;
        this.career = career;
        this.year = year;
    }

    //sets, gets y toString
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCantStudents() {
        return cantStudents;
    }

    public void setCantStudents(int cantStudents) {
        this.cantStudents = cantStudents;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getCarrer() {
        return career;
    }

    public void setCarrer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastName=" + lastName + ", cantStudents=" + cantStudents + '}';
    }

}
