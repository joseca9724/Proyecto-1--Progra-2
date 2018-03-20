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
public class Speakers extends Audiovisual{
    public String type,trademark,commentary;

    public Speakers(String type,String trademark, String commentary, boolean use, String Name, int serial) {
        super(use, Name, serial);
        this.trademark=trademark;
        this.type = type;
        this.commentary = commentary;
    }
    
    public Speakers() {
        super();
        this.trademark="";
        this.type = "";
        this.commentary = "";
    }

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

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Speakers{" + "type=" + type + ", commentary=" + commentary + '}';
    }
    
}
