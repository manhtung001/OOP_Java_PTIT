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
public class QuanLyDat  implements Serializable {
    
     private KhachHang KhachHang;
    private  Tour Tour;
    private int soluong;
    private String ngayDat;

    public QuanLyDat() {
    }

    public QuanLyDat(KhachHang KhachHang, Tour Tour, int soluong, String ngayDat) {
        this.KhachHang = KhachHang;
        this.Tour = Tour;
        this.soluong = soluong;
        this.ngayDat = ngayDat;
    }

    
    
    public String getMavaten() {
        return Tour.getMa()+"";
    }
    
//    public Double tinhCong() {
//        Double tiencong = 0.2*(double)soluong*(dichvu.getCuoc()-dichvu.getCphi());
//        tiencong = (double) Math.floor(tiencong * 100) / 100;
//        return tiencong;
//    }

    public KhachHang getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(KhachHang KhachHang) {
        this.KhachHang = KhachHang;
    }

    public Tour getTour() {
        return Tour;
    }

    public void setTour(Tour Tour) {
        this.Tour = Tour;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    
    public Object[] toObject() {
        return new Object[] {
            KhachHang.getMa(), KhachHang.getTen(), Tour.getMa(), Tour.getDongia(), soluong, ngayDat
        };        
    };
    
}
