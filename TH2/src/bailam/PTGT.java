package bailam;

public class PTGT {
    private String soKhung;
    private String hang;
    private String ngayLanBanh;
    private double gia;

    public PTGT() {
    }

    public PTGT(String soKhung, String hang, String ngayLanBanh, double gia) {
        this.soKhung = soKhung;
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.gia = gia;
    }

    public String getSoKhung() {
        return soKhung;
    }

    public void setSoKhung(String soKhung) {
        this.soKhung = soKhung;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
