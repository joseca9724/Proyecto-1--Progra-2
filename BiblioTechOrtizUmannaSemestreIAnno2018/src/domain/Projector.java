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
public class Projector extends Audiovisual{
    //atributos
    public String trademark;
    public String goodCondition;
    public String commentary;
    
    //constructor
    public Projector(boolean use,String trademark, String goodCondition, String commentary, String Name, String serial) {
        super(use,Name, serial);
        this.trademark = trademark;
        this.goodCondition = goodCondition;
        this.commentary = commentary;
    }
    //constructor por default
    public Projector() {
        super();
        this.trademark = "";
        this.goodCondition = "";
        this.commentary = "no comments";
    }
    //sets, gtes and toString

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String isGoodCondition() {
        return goodCondition;
    }

    public void setGoodCondition(String goodCondition) {
        this.goodCondition = goodCondition;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return super.toString()+"Projector{" + "trademark=" + trademark + ", goodCondition=" + goodCondition + ", commentary=" + commentary + '}';
    }
}
