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
public class KhachHang implements Serializable {
    
     private int ma;
    private String hoten, diachi, nhom;
    private static int sma=10000;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diachi, String nhom) {
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.nhom = nhom;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, diachi, nhom
        };        
    };
    
}
