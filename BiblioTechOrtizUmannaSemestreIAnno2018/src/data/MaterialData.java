/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Audiovisual;
import domain.Book;
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
public class MaterialData {

    //atributos
    private String pathBooks, pathAudio;

    //costructor
    public MaterialData() {
        this.pathBooks = "Books.dat";
        this.pathAudio = "Audiovisual.dat";
    }

    //guarda los libros
    public void saveBook(Book book) throws IOException, ClassNotFoundException {
        System.out.println("entro");
        File file = new File(this.pathBooks);
        List<Book> bookstList = new ArrayList<Book>();

        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object aux = objectInputStream.readObject();
            bookstList = (List<Book>) aux;
            objectInputStream.close();
        }

        bookstList.add(book);
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        output.writeUnshared(bookstList);
        output.close();
    }
    
    //Recupera los libros en una lista
    public ArrayList<Book> readBook() throws IOException, ClassNotFoundException {
        File myFile = new File(this.pathBooks);
        ArrayList<Book> booktList = new ArrayList<Book>();
        if (myFile.exists()) {
            ObjectInputStream ObjectinputStream = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ObjectinputStream.readObject();
            booktList = (ArrayList<Book>) aux;
            ObjectinputStream.close();
        }//If       

        return booktList;
    }//obteneObjeto

    //guarda los audiovisuales
    public void saveAudiovisual(Audiovisual audiovisual) throws IOException, ClassNotFoundException {
        System.out.println("entro");
        File file = new File(this.pathAudio);
        List<Audiovisual> audiovisualList = new ArrayList<Audiovisual>();

        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object aux = objectInputStream.readObject();
            audiovisualList = (List<Audiovisual>) aux;
            objectInputStream.close();
        }

        audiovisualList.add(audiovisual);
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        output.writeUnshared(audiovisualList);
        output.close();
    }
    
    //recupera los audiovisuales en una lista
    public ArrayList<Audiovisual> readAudiovisual() throws IOException, ClassNotFoundException {
        File myFile = new File(this.pathAudio);
        ArrayList<Audiovisual> audiovisualtList = new ArrayList<Audiovisual>();
        if (myFile.exists()) {
            ObjectInputStream ObjectinputStream = new ObjectInputStream(new FileInputStream(myFile));
            Object aux = ObjectinputStream.readObject();
            audiovisualtList = (ArrayList<Audiovisual>) aux;
            ObjectinputStream.close();
        }//If       

        return audiovisualtList;
    }//obteneObjeto
}
