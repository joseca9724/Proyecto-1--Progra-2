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
public class DigitalBook extends Book{
    
    //atributo
    private int sizeMB;

    //constructores
    public DigitalBook(int sizeGB) {
        this.sizeMB = sizeGB;
    }
    
    public DigitalBook() {
        this.sizeMB = 0;
    }
    
    //sets, gets y toString
    public int getSizeGB() {
        return sizeMB;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeMB = sizeGB;
    }
    
    @Override
     public String toString() {
        return "DigitalBook{" + "isbn= " + super.getIsbn() + ", title= " + super.getTitle() + ", author=  " + super.getAuthor() + ", year= " + super.getYear()+ " type= " + super.getType() + ", quantity= " + super.getQuiantity()+ " sizeMB= " + sizeMB + '}';
    }

}
