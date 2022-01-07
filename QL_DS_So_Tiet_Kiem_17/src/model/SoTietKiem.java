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
public class SoTietKiem implements Serializable {
    
    private KhachHang khachHang;
    private  NganHang nganHang;
    private Double tienGui;

    public SoTietKiem() {
    }

    public SoTietKiem(KhachHang khachHang, NganHang nganHang, Double tienGui) {
        this.khachHang = khachHang;
        this.nganHang = nganHang;
        this.tienGui = tienGui;
    }

   
    
    
    public Double getLaiSuat() {
        return nganHang.getLaiSuat();
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NganHang getNganHang() {
        return nganHang;
    }

    public void setNganHang(NganHang nganHang) {
        this.nganHang = nganHang;
    }

    public Double getTienGui() {
        return tienGui;
    }

    public void setTienGui(Double tienGui) {
        this.tienGui = tienGui;
    }
    
    public String getMavaten() {
        return khachHang.getMa()+" " + khachHang.getHoten();
    }
    
    public Double getTien() {
        return (tienGui + tienGui*(nganHang.getLaiSuat()/100));
    }

    public Object[] toObject() {
        return new Object[] {
            khachHang.getMa(), khachHang.getHoten(), nganHang.getMa(), nganHang.getTen(), nganHang.getLaiSuat(), tienGui
        };        
    };
}