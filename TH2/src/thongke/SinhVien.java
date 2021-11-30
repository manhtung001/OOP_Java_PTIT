/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongke;

/**
 *
 * @author GL75
 */
public class SinhVien {
    private int ma;
    private String hoten;
    private String nsinh;
    
    public SinhVien() {
    }

    public SinhVien(int ma, String hoten, String nsinh) {
        this.ma = ma;
        this.hoten = hoten;
        this.nsinh = nsinh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNsinh() {
        return nsinh;
    }

    public void setNsinh(String nsinh) {
        this.nsinh = nsinh;
    }
    
    public String toString() {
        return ma + "\t" + hoten + "\t" + nsinh;
    }
}
