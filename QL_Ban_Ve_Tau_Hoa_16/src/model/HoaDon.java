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
    
    private NguoiMua nguoimua;
    private Ve ve;
    private int soluong;

    public HoaDon() {
    }
    
    public HoaDon(NguoiMua nguoimua, Ve ve, int soluong) {
        this.nguoimua = nguoimua;
        this.ve = ve;
        this.soluong = soluong;
    }
    
    public String getMavaten() {
        return nguoimua.getMa() + " " +nguoimua.getHoten();
    }
    
    public Double getTienPhaiTra() {
        return (double)soluong*ve.getDonGia();
    }

    public NguoiMua getNguoimua() {
        return nguoimua;
    }

    public void setNguoimua(NguoiMua nguoimua) {
        this.nguoimua = nguoimua;
    }

    public Ve getVe() {
        return ve;
    }

    public void setVe(Ve ve) {
        this.ve = ve;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
    
    public Object[] toObject() {
        return new Object[] {
            nguoimua.getMa(), nguoimua.getHoten(), ve.getMa(), ve.getLoaiGhe(), soluong
        };        
    };
    
}
