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
public class HoaDon implements Serializable {
    
    private KhachHang kh;
    private  DienThoai dt;
    private int soluong;

    public HoaDon() {
    }

    public HoaDon(KhachHang KhachHang, DienThoai DienThoai, int soluong) {
        this.kh = KhachHang;
        this.dt = DienThoai;
        this.soluong = soluong;
    }

    public String getMavaten() {
        return kh.getMa()+" "+kh.getHoten();
    }
    
    public Double tinhHoaDon() {
        Double gia = (double)soluong*dt.getGia();
        return gia;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public DienThoai getDt() {
        return dt;
    }

    public void setDt(DienThoai dt) {
        this.dt = dt;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toObject() {
        return new Object[] {
            kh.getMa(), kh.getHoten(), dt.getMa(), dt.getHangsx(), soluong
        };        
    };
    
}
