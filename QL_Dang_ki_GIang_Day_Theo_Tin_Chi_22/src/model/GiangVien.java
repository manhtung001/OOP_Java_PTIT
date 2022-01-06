/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class GiangVien  implements Serializable {
    
    
    private int ma;
    private String hoten, sdt, khoa;
    private static int sma=10000;

    public GiangVien() {
    }

    public GiangVien(String hoten, String sdt, String khoa) {
        this.ma = sma++;
        this.hoten = hoten;
        this.sdt = sdt;
        this.khoa = khoa;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GiangVien.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, sdt, khoa
        };        
    };
    
}