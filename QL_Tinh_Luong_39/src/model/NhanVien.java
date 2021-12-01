/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoDienThoaiException;
import controller.TrongException;
import controller.bacLuongException;
import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class NhanVien implements Serializable {
    
    private int ma, bacluong;
    private String hoten, dchi, sdt;
    private static int sma=1000;

    public NhanVien() {
    }

    public NhanVien(int bacluong, String hoten, String dchi, String sdt)
            throws TrongException, SoDienThoaiException, bacLuongException
    {
        if(hoten.isEmpty() || dchi.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new SoDienThoaiException();
        if(bacluong<1||bacluong>9) throw new bacLuongException();
        this.ma = sma++;
        this.bacluong = bacluong;
        this.hoten = hoten;
        this.dchi = dchi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getBacluong() {
        return bacluong;
    }

    public void setBacluong(int bacluong) {
        this.bacluong = bacluong;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, dchi, sdt, bacluong
        };        
    };
    
}
