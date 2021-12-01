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
    private int ma, tongSoTiet;
    private String tenMon, loai;
    private static int sma=100;

    public MonHoc() {
        ma=sma++;
    }

    public MonHoc(int ma, int tongSoTiet, String tenMon, String loai) {
        this.ma = ma;
        this.tongSoTiet = tongSoTiet;
        this.tenMon = tenMon;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
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
        MonHoc.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, tenMon, tongSoTiet, loai
        };
    }
}
