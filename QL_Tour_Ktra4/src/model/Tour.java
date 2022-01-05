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
public class Tour implements Serializable {
    
//    1 ngày, dưới 5 ngày, dưới 7 ngày, dài ngày
    
     private int ma;
    private String kieu, thongtin;
    private double dongia;
    private static int sma=1000;

    public Tour() {
    }

    public Tour( String kieu, String thongtin, double dongia)
    {
        this.ma = sma++;
        this.kieu = kieu;
        this.thongtin = thongtin;
        this.dongia = dongia;
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

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tour.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, kieu, thongtin, dongia
        };        
    };
    
}
