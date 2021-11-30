/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoDienThoai;

/**
 *
 * @author GL75
 */
public class PhoneNumber {
    private String mavung, noivung;
    
    public PhoneNumber(String ma, String noi){
        this.mavung = ma;
        this.noivung = noi;
    }

    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getNoivung() {
        return noivung;
    }

    public void setNoivung(String noivung) {
        this.noivung = noivung;
    }
    
    @Override
    public String toString(){
        return getMavung() + "-" + getNoivung();
    }
    
}
