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
    
//    1 ngày, dưới 5 ngày, dưới 7 ngày, dài ngày
    
    private int ma;
    private String hoten, diachi, loai;
    private static int sma=10000;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diachi, String loai) {
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }

        
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, diachi, loai
        };        
    };
    
}