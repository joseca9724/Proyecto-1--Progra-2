/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author byron
 */
public class Material implements Serializable {
    //atributo
    private boolean used;

    //constructores
    public Material(boolean used) {
        this.used = used;
    }
    
    public Material() {
        this.used = false;
    }

    //sets, gets 
    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
    
    
    
}
