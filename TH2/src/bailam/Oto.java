package bailam;

public class Oto extends PTGT implements IHangXe{
    private int soCho;
    private double tocDo;

    public Oto(int soCho, double tocDo) {
        this.soCho = soCho;
        this.tocDo = tocDo;
    }

    public Oto(String soKhung, String hang, String ngayLanBanh, double gia, int soCho, double tocDo) {
        super(soKhung, hang, ngayLanBanh, gia);
        this.soCho = soCho;
        this.tocDo = tocDo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getTocDo() {
        return tocDo;
    }

    public void setTocDo(double tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return getSoKhung() + "\t" + getLaiHang() + "\t" + getNgayLanBanh() + "\t" + getGia() + "\t" + soCho + "\t" + tocDo;
    }

    @Override
    public String getLaiHang() {
        return ("Oto" + getHang()).toUpperCase();
    }
    
    
    
    
}
