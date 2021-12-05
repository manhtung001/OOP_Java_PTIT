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
public class QLSX implements Serializable {
    
    private PhongHoc phonghoc;
    private  Lop lop;
    private int kip;

    public QLSX() {
    }

    public QLSX(PhongHoc phonghoc, Lop lop, int kip) {
        this.phonghoc = phonghoc;
        this.lop = lop;
        this.kip = kip;
    }

    public PhongHoc getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(PhongHoc phonghoc) {
        this.phonghoc = phonghoc;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            phonghoc.getMa(), phonghoc.getTenPhong(), phonghoc.getSoGhe(), lop.getMa(), lop.getTen(), lop.getSoSinhVien(), kip
        };        
    };
    
}
