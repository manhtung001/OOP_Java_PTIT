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
public class IntlPhoneNumber extends PhoneNumber{
    
    private String maquocgia;
    
    public IntlPhoneNumber(String maqg, String ma, String noi){
        super(ma, noi);
        this.maquocgia = maqg;
    }

    public String getMaquocgia() {
        return maquocgia;
    }

    public void setMaquocgia(String maquocgia) {
        this.maquocgia = maquocgia;
    }
    
    @Override
    public String toString(){
        return this.maquocgia + "-" + this.getMavung().substring(1) + "-" + this.getNoivung();
    }
    
}
