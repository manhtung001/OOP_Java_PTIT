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
public class Tour implements Serializable {
    
    private int ma;
    private String kieu, thongtin;
    private Double gia;
    private static int sma=1000;

    public Tour() {
    }

    public Tour(String kieu, String thongtin, Double gia) 
            throws TrongException 
    {
        if(thongtin.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.kieu = kieu;
        this.thongtin = thongtin;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tour.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, kieu, thongtin, gia
        };
    }
    
    
}
