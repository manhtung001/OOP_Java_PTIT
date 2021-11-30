/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author GL75
 */
public class SinhVien {
	
    private int ma;
    private String ten;

    public SinhVien() {
    }

//    public SinhVien(int ma, String ten) throws KhongRongException, SoDuongException {
//        if (ten.isEmpty()) throw new KhongRongException("ten khong de trong");
//        if(ma <=0) throw new SoDuongException("ma la so duong");
//        this.ma = ma;
//        this.ten = ten;
//    }
    
    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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
    
    public String toString() {
        return ma+"\t"+ten;
    }
	
	
	

}
