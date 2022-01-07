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
public class MonHoc implements Serializable {
    
    private int ma;
    private String ten, loai;
    private int sotin;
    private static int sma=100;

    public MonHoc() {
    }

    public MonHoc(int ma, String ten, String loai, int sotin) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.sotin = sotin;
    }
    
    public MonHoc(String ten, String loai, int sotin) {
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.sotin = sotin;
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

    public int getSotin() {
        return sotin;
    }

    public void setSotin(int sotin) {
        this.sotin = sotin;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }

    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, sotin, loai
        };        
    };
}