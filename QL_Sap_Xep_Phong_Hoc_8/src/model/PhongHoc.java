/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class PhongHoc implements Serializable {
    
    private int ma, soGhe;
    private String tenPhong, kieu;
    private static int sma=10000;

    public PhongHoc() {
    }

    public PhongHoc(int soGhe, String tenPhong, String kieu)
            throws TrongException
    {
        if(tenPhong.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.soGhe = soGhe;
        this.tenPhong = tenPhong;
        this.kieu = kieu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
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
        PhongHoc.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, tenPhong, soGhe, kieu
        };        
    };
    
}
