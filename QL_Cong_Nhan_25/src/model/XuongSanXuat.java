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
public class XuongSanXuat  implements Serializable {
    
    private int ma;
    private String ten, mota;
    private double heSoCongViec;
    private static int sma=100;

    public XuongSanXuat() {
    }

    public XuongSanXuat(int ma, String ten, String mota, double heSoCongViec) {
        this.ma = ma;
        this.ten = ten;
        this.mota = mota;
        this.heSoCongViec = heSoCongViec;
    }
    
    public XuongSanXuat(String ten, String mota, double heSoCongViec)
            throws TrongException
    {
        if(ten.isEmpty()) throw new TrongException();
        this.ma = sma++;
        this.ten = ten;
        this.mota = mota;
        this.heSoCongViec = heSoCongViec;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getHeSoCongViec() {
        return heSoCongViec;
    }

    public void setHeSoCongViec(double heSoCongViec) {
        this.heSoCongViec = heSoCongViec;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        XuongSanXuat.sma = sma;
    }
    
    
    
    
    public Object[] toObject() {
        return new Object[] {
            ma, ten, mota, heSoCongViec
        };        
    };
    
}
