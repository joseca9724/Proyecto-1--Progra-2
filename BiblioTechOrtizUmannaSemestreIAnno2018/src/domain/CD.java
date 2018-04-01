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
public class CD extends Audiovisual{
    
    //atributos
    public String type,commentary;

    //Constructores
    public CD(String type, String commentary, boolean use, String Name, String serial) {
        super(use, Name, serial);
        this.type = type;
        this.commentary = commentary;
    }

    public CD() {
        super();
        this.type = "";
        this.commentary = "";
    }

    //sets, gets y toString
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return super.toString()+"CD{" + "type=" + type + ", commentary=" + commentary + '}';
    }
}
