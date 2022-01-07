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
public class BangDiem implements Serializable {
    
    private SinhVien sv;
    private  MonHoc mh;
    private double diem;

    public BangDiem() {
    }

    public BangDiem(SinhVien sv, MonHoc mh, double diem) {
        this.sv = sv;
        this.mh = mh;
        this.diem = diem;
    }


//    public String getMavaten() {
//        return Tour.getMa()+"";
//    }
    
//    public Double tinhCong() {
//        Double tiencong = 0.2*(double)soluong*(dichvu.getCuoc()-dichvu.getCphi());
//        tiencong = (double) Math.floor(tiencong * 100) / 100;
//        return tiencong;
//    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public String getTenSV() {
        return sv.getHoten();
    } 
    
    public int getSoTin() {
        return mh.getSotin();
    } 
   
    
    public Object[] toObject() {
        return new Object[] {
            sv.getMa(), sv.getHoten(), mh.getMa(), mh.getTen(), mh.getSotin(), diem
        };        
    };
}