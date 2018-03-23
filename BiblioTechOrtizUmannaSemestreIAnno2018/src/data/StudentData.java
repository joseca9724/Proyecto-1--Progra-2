/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author byron
 */
public class StudentData {

    private String path;

    //constructor
    public StudentData() {
        this.path = "Students.dat";
    }

    //guarda los estudiantes
    public void saveStudent(Student student) throws IOException, ClassNotFoundException {
        File file = new File(this.path);
        List<Student> studentList = new ArrayList<Student>();

        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object aux = objectInputStream.readObject();
            studentList = (List<Student>) aux;
            objectInputStream.close();
        }

        studentList.add(student);
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        output.writeUnshared(studentList);
        output.close();
    }

    //recupera los estudiantes en una lista
    public ArrayList<Student> readStudent() throws IOException, ClassNotFoundException {
        File myFile = new File(this.path);
        ArrayList<Student> studentList = new ArrayList<>();
        if (myFile.exists()) {
            ObjectInputStream ObjectinputStream = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ObjectinputStream.readObject();
            studentList = (ArrayList<Student>) aux;
            ObjectinputStream.close();
        }//If       

        return studentList;
    }//obteneObjeto
}
