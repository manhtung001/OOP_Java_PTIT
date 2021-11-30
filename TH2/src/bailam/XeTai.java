package bailam;

public class XeTai extends PTGT implements IHangXe{
    private double taiTrong;
    private boolean thungXe;

    public XeTai(double taiTrong, boolean thungXe) {
        this.taiTrong = taiTrong;
        this.thungXe = thungXe;
    }

    public XeTai( String soKhung, String hang, String ngayLanBanh, double gia, double taiTrong, boolean thungXe) {
        super(soKhung, hang, ngayLanBanh, gia);
        this.taiTrong = taiTrong;
        this.thungXe = thungXe;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }

    public boolean isThungXe() {
        return thungXe;
    }

    public void setThungXe(boolean thungXe) {
        this.thungXe = thungXe;
    }
    
     @Override
    public String toString() {
        return getSoKhung() + "\t" + getLaiHang() + "\t" + getNgayLanBanh() + "\t" + getGia() + "\t" + taiTrong + "\t" + thungXe;
    }

    @Override
    public String getLaiHang() {
        return ("TAI" + getHang()).toUpperCase();
    }
    
}
