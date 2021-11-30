package QL_Thu_Vien.model;

import java.io.Serializable;


public class Sach implements Serializable {
    // mã sách, Tên sách, Tác giả, Chuyên ngành, Số lượng
    private  int ma;
    private String ten, tgia, cn;
    private int sluong;
    private static int sma=10000;

    public Sach() {
        ma=sma++;
    }

    public Sach(int ma, String ten, String tgia, String cn, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tgia = tgia;
        this.cn = cn;
        this.sluong = sluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    
    public  Object[] toObject(){
        return new Object[]{
            ma,ten,tgia,cn,sluong
        };
    }
    
    
}
