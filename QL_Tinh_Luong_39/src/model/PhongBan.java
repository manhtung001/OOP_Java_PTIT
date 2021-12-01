/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoDienThoaiException;
import controller.TrongException;
import controller.bacLuongException;
import controller.hsCongViecException;
import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class PhongBan implements Serializable {
    
    private int ma;
    private String tenPhong, mota;
    private double hsCongViec;
    private static int sma=100;

    public PhongBan() {
    }

    public PhongBan(int ma, String tenPhong, String mota, double hsCongViec) {
        this.ma = ma;
        this.tenPhong = tenPhong;
        this.mota = mota;
        this.hsCongViec = hsCongViec;
    }
    

    public PhongBan(String tenPhong, String mota, double hsCongViec) 
            throws TrongException, hsCongViecException
    {
        if(tenPhong.isEmpty() || mota.isEmpty()) throw new TrongException();
        if(hsCongViec<1.0||hsCongViec>20.0) throw new hsCongViecException();
        this.ma = sma++;
        this.tenPhong = tenPhong;
        this.mota = mota;
        this.hsCongViec = hsCongViec;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getHsCongViec() {
        return hsCongViec;
    }

    public void setHsCongViec(double hsCongViec) {
        this.hsCongViec = hsCongViec;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongBan.sma = sma;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            ma, tenPhong, mota, hsCongViec
        };        
    };
    
}
