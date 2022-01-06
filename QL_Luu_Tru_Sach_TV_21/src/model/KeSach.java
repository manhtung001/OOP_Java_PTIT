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
public class KeSach implements Serializable {
    
    private int ma;
    private String ten, loai;
    private int  soluongMax;
    private static int sma=100;

    public KeSach() {
    }

    public KeSach(int ma, String ten, String loai, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.soluongMax = soluong;
    }
    
     public KeSach(String ten, String loai, int soluong) {
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.soluongMax = soluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoluongMax() {
        return soluongMax;
    }

    public void setSoluongMax(int soluongMax) {
        this.soluongMax = soluongMax;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KeSach.sma = sma;
    }

     
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, loai, soluongMax
        };        
    };
}
