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
public class DienThoai implements Serializable {
    
     private int ma;
    private String hangsx, model;
    private Double gia;
    private static int sma=10000;

    public DienThoai() {
    }

    public DienThoai(int ma, String hangsx, String model, Double gia) {
        this.ma = ma;
        this.hangsx = hangsx;
        this.model = model;
        this.gia = gia;
    }
    
    public DienThoai(String hangsx, String model, Double gia) {
        this.ma = sma++;
        this.hangsx = hangsx;
        this.model = model;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        DienThoai.sma = sma;
    }

    
    
    public Object[] toObject() {
        return new Object[] {
            ma, hangsx, model, gia
        };        
    };
    
}
