/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra2;

/**
 *
 * @author GL75
 */
public interface ChucNang {
    public void NhapOto();
    public void NhapXeMay();
    public void VietDS();
    public void xoa();
    public void sua();
    public void TimTheoMa();
    public void TimTheoHang();
    public void TimTheoMau();
    public void TimTheoNam(); // tu nam den nam
    public void TimTheoGiaCao();    // >= gia
    public void TimTheoSoCho(); // oto
    public void sapxepTheoMa(); //string
    public void sapxepTheoNam(); //int
    public void sapxepTheoGia(); //double
    public void sapxepTheoGiaGiamDan(); //double
    public void sapxepTheoSoCho(); //oto
    public void sapxepTheoNamvaGia(); //2 thuoc tinh
    public void thongke(); //max, min avg, sum. count
}
