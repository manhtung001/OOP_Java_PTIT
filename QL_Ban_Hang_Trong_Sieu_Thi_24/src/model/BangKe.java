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
public class BangKe implements Serializable {
    
    private KhachHang kh;
    private  MatHang mh;
    private int soluong;

    public BangKe() {
    }

    public BangKe(KhachHang kh, MatHang mh, int soluong) {
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
    }

   
    
    public String getMavaten() {
        return kh.getMa()+" "+kh.getHoten();
    }
    
    public Double tinhHoaDon() {
        Double gia = (double)soluong*mh.getGia();
        return gia;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Object[] toObject() {
        return new Object[] {
            kh.getMa(), kh.getHoten(), mh.getMa(), mh.getTen(), mh.getGia(), soluong,
        };        
    };
}
