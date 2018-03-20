/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Josec
 */
public class Audiovisual extends Material{
    //atributos
    public String Name;
    public int serial;

    //constructor
    public Audiovisual(boolean use,String Name, int serial) {
        super(use);
        this.Name = Name;
        this.serial = serial;
    }
    //constructor por default
    public Audiovisual() {
        super();
        this.Name = "";
        this.serial =-1;
    }
    //sets, gets and toString

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Audiovisual{" + "Name=" + Name + ", serial=" + serial + '}';
    }
    
}
