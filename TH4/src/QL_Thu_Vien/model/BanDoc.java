/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_Thu_Vien.model;

import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class BanDoc implements Serializable {
    // ma ban doc, ho ten, dia chi, sdt
    private int ma;
    private String hoten, dchi,dthoai;
    private static int sma=10000;

    public BanDoc() {
        ma=sma++;
    }

    public BanDoc(int ma, String hoten, String dchi, String dthoai) {
        this.ma = ma;
        this.hoten = hoten;
        this.dchi = dchi;
        this.dthoai = dthoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, dchi, dthoai
        };
    } 
}
