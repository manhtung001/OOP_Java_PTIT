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
public class BangDangKy implements Serializable {
    
    private GiangVien gv;
    private  MonHoc monhoc;
    private int soLop;
    private String thoigian;

    public BangDangKy() {
    }

    public BangDangKy(GiangVien gv, MonHoc monhoc, int soLop, String thoigian) {
        this.gv = gv;
        this.monhoc = monhoc;
        this.soLop = soLop;
        this.thoigian = thoigian;
    }

    

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }


    public String getTenMonHoc() {
       return monhoc.getTen();
   }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
    
    
    public Object[] toObject() {
        return new Object[] {
            gv.getMa(), gv.getHoten(), monhoc.getMa(), monhoc.getTen(), soLop, thoigian
        };        
    };
}