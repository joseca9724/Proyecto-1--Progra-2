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
public class Student implements Serializable{
    
    private String name, lastName;
    private int cantStudents, year;

     public Student() {
        this.name = "";
        this.lastName = "";
        this.cantStudents = 0;
        this.year = 0;
    }

    public Student(String name, String lastName, int cantStudents, int year) {
        this.name = name;
        this.lastName = lastName;
        this.cantStudents = cantStudents;
        this.year = year;
    }
    
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
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastName=" + lastName + ", cantStudents=" + cantStudents + '}';
    }

  
    
}
