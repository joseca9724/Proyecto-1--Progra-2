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
    private String state;

    //constructores
    public PhysicalBook(String state) {
        super();
        this.state = state;
    }
    
    public PhysicalBook() {
        super();
        this.state = "";
    }

    //sets, gets y toString
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    @Override
     public String toString() {
        return "PhysicalBook{" + "isbn= " + super.getIsbn() + ", title= " + super.getTitle() + ", author= " + super.getAuthor() + ", year= " + super.getYear()+  " type= " + super.getType() + ", quantity= " + super.getQuiantity()+ " state= " + state + '}';
    }
    
}
