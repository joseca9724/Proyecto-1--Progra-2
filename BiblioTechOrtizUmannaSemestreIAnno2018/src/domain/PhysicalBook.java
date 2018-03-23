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
public class PhysicalBook extends Book {
    
    //atributo
    private int quiantity;

    //constructores
    public PhysicalBook(int quiantity) {
        super();
        this.quiantity = quiantity;
    }
    
    public PhysicalBook() {
        super();
        this.quiantity = 0;
    }

    //sets, gets y toString
    public int getQuiantity() {
        return quiantity;
    }

    public void setQuiantity(int quiantity) {
        this.quiantity = quiantity;
    }
    
    @Override
     public String toString() {
        return "PhysicalBook{" + "isbn= " + super.getIsbn() + ", title= " + super.getTitle() + ", author= " + super.getAuthor() + ", year= " + super.getYear()+  " type= " + super.getType() + " quiantity= " + quiantity + '}';
    }
    
}
