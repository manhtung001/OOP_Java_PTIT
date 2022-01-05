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
public class KhachHang implements Serializable {
    
    private int ma;
    private String ten, kieu;
    private static int sma=100;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String kieu) {
        this.ma = ma;
        this.ten = ten;
        this.kieu = kieu;
    }
    
    public KhachHang(String ten, String kieu)
            throws TrongException
    {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.kieu = kieu;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, kieu
        };        
    };
}
