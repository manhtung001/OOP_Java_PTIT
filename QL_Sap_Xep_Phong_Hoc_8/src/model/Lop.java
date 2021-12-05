/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class Lop implements Serializable {
    
    private int ma, soSinhVien;
    private String ten;
    private static int sma=100;

    public Lop() {
    }

    public Lop(int ma, int soSinhVien, String ten) {
        this.ma = ma;
        this.soSinhVien = soSinhVien;
        this.ten = ten;
    }
    
    public Lop(int soSinhVien, String ten)
            throws TrongException
    {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.soSinhVien = soSinhVien;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, soSinhVien
        };        
    };
    
    
    
}
