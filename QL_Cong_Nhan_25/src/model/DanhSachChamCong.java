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
public class DanhSachChamCong  implements Serializable  {
    
    private CongNhan congnhan;
    private  XuongSanXuat xuong;
    private int ngayLam;

    public DanhSachChamCong() {
    }

    public DanhSachChamCong(CongNhan congnhan, XuongSanXuat xuong, int ngayLam) {
        this.congnhan = congnhan;
        this.xuong = xuong;
        this.ngayLam = ngayLam;
    }

    public String getMavaten() {
        return congnhan.getMa() + " " +congnhan.getHoten();
    }
    
    public Double tinhCong() {
        Double tiencong = 450000*(double)congnhan.getBactho()*xuong.getHeSoCongViec()*((double)ngayLam/22);
        tiencong = (double) Math.floor(tiencong * 100) / 100;
        return tiencong;
    }

    public CongNhan getCongnhan() {
        return congnhan;
    }

    public void setCongnhan(CongNhan congnhan) {
        this.congnhan = congnhan;
    }

    public XuongSanXuat getXuong() {
        return xuong;
    }

    public void setXuong(XuongSanXuat xuong) {
        this.xuong = xuong;
    }

    public int getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(int ngayLam) {
        this.ngayLam = ngayLam;
    }
    
    

    public Object[] toObject() {
        return new Object[] {
            congnhan.getMa(), congnhan.getHoten(), congnhan.getBactho(), xuong.getMa(), xuong.getTen(), xuong.getHeSoCongViec(), ngayLam
        };        
    };
    
}
