/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author byron
 */
public class BiblioTech {
    private ArrayList<Student> students;
    private ArrayList<Book> materialsBooks;
    private ArrayList<Audiovisual> materialsAudiovisual;
    String size;

    public BiblioTech() {
        this.students = new ArrayList<>();
        this.materialsBooks = new ArrayList<>();
        this.materialsAudiovisual = new ArrayList<>();
        this.size = "";
    }

    public BiblioTech(ArrayList<Student> students, String size) {
        this.students = students;
        this.size = size;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public ArrayList<Book> getMaterialsBooks() {
        return materialsBooks;
    }

    public void setMaterialsBooks(Book materialsBooks) {
        this.materialsBooks.add(materialsBooks);
    }

    public ArrayList<Audiovisual> getMaterialsAudio() {
        return materialsAudiovisual;
    }

    public void setMaterialsAudio(Audiovisual materialsAudio) {
        this.materialsAudiovisual.add(materialsAudio);
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String studentsSize() {
            if (students.size() < 10) {
                size = "";
                size += "00" + String.valueOf(students.size());
            } else if (students.size() < 100) {
                size = "";
                size += "0" + String.valueOf(students.size());
            } else if (students.size() < 1000) {
                size = "";
                size += String.valueOf(students.size());
            }
        
        return size;
    }
}
