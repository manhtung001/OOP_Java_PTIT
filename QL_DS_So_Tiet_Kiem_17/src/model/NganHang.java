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
public class NganHang implements Serializable {
    
    private int ma;
    private String ten;
    private Double laiSuat;
    private static int sma=100;

    public NganHang() {
    }

    public NganHang(int ma, String ten, Double laiSuat) {
        this.ma = ma;
        this.ten = ten;
        this.laiSuat = laiSuat;
    }
    
    public NganHang(String ten, Double laiSuat) {
        this.ma = sma++;
        this.ten = ten;
        this.laiSuat = laiSuat;
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

    public Double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(Double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NganHang.sma = sma;
    }

   
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, laiSuat
        };        
    };
}