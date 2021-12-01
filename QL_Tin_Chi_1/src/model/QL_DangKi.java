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
public class QL_DangKi implements Serializable {
    private String time;
    private SinhVien sv;
    private MonHoc mh;

    public QL_DangKi() {
    }

    public QL_DangKi(String time, SinhVien sv, MonHoc mh) {
        this.time = time;
        this.sv = sv;
        this.mh = mh;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

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
    
    public Object[] toObject() {
        return new Object[] {
            sv.getMa(), sv.getHoten(), mh.getMa(), mh.getTenMon(), time
        };
    }
}
