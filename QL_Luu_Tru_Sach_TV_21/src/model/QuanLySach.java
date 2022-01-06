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
public class QuanLySach implements Serializable {
    
    private Sach sach;
    private  KeSach keSach;
    private int soluong;
    private String tinhTrang;

    public QuanLySach() {
    }

    public QuanLySach(Sach sach, KeSach keSach, int soluong, String tinhTrang) {
        this.sach = sach;
        this.keSach = keSach;
        this.soluong = soluong;
        this.tinhTrang = tinhTrang;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public KeSach getKeSach() {
        return keSach;
    }

    public void setKeSach(KeSach keSach) {
        this.keSach = keSach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public String getChuyenNganh() {
        return sach.getChuyenNganh();
    }
    

    public Object[] toObject() {
        return new Object[] {
            sach.getMa(), sach.getTen(), keSach.getMa(), keSach.getSoluongMax(), soluong, tinhTrang
        };        
    };
}