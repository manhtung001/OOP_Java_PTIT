/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author GL75
 */
public class CongNhan  implements Serializable  {
    
//     (mã công nhân, Họ tên, Địa chỉ, Số điện thoại, Bậc 
//thợ) – trong đó Bậc thợ là một số nguyên từ 1 đến 7
    
    private int ma;
    private String hoten, diachi, sdt;
    private int bactho;
    private static int sma=1000;

    public CongNhan() {
    }

    public CongNhan(String hoten, String diachi, String sdt, int bactho)        
            throws TrongException, DienThoaiException
    {
        if(hoten.isEmpty()) throw new TrongException();
        if(!sdt.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.bactho = bactho;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getBactho() {
        return bactho;
    }

    public void setBactho(int bactho) {
        this.bactho = bactho;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public Object[] toObject() {
        return new Object[] {
            ma, hoten, diachi, sdt, bactho
        };        
    };
    
}
