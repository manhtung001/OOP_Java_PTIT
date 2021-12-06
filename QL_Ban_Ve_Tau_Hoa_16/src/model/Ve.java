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
public class Ve implements Serializable {
    
    private int ma;
    private String loaiGhe;
    private double donGia;
    private static int sma=10000;

    public Ve() {
    }

    public Ve(int ma, String loaiGhe, double donGia)
    {
        this.ma = ma;
        this.loaiGhe = loaiGhe;
        this.donGia = donGia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Ve.sma = sma;
    }
    
    
    
    public Ve(String loaiGhe, double donGia)
            throws TrongException
    {
        if(loaiGhe.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.loaiGhe = loaiGhe;
        this.donGia = donGia;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, loaiGhe, donGia
        };        
    };

    
}
