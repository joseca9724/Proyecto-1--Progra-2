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
public class StudentEdu extends Student {

    private String uid, size;

    public StudentEdu() {
        super();
        this.uid = "E";

    }

    public StudentEdu(String carrer) {
        super();
        this.uid = "E";

    }


    public void setUid(int anno, String uid) {
        String anno2 = String.valueOf(anno);
        int uid1 = Integer.parseInt(uid);
         if (uid1 < 10) {
                size = "";
                size += "00" + String.valueOf(uid1);
            } else if (uid1 < 100) {
                size = "";
                size += "0" + String.valueOf(uid1);
            } else if (uid1 < 1000) {
                size = "";
                size += String.valueOf(uid1);
            }
        char[] v1 = anno2.toCharArray();
        this.uid = this.uid += String.valueOf(v1[3]);
        this.uid = this.uid += size;
    }

    public String getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "StudentEdu{" + "name= " + super.getName() + ", lastName= " + super.getLastName() + ", carrer= " + super.getCarrer() + ", year of income " + super.getYear() + ", uid= " + uid + '}';
    }

    
}
