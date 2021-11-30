
public class GVCoHuu extends GiangVien implements ITinhLuong {

	private int soGioDinhMuc;
	
	public GVCoHuu() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public GVCoHuu(String ma, String ten, int hocVi, int soGioDinhMuc) {
		super(ma, ten, hocVi);
		this.soGioDinhMuc = soGioDinhMuc;
	}


	public int getSoGioDinhMuc() {
		return soGioDinhMuc;
	}



	public void setSoGioDinhMuc(int soGioDinhMuc) {
		this.soGioDinhMuc = soGioDinhMuc;
	}

	@Override
	public void getTienLinh() {
		this.tien = this.soGioDinhMuc * 140 * this.hocVi;
		
	}



	@Override
	public String toString() {
		return "GVCoHuu [" +super.toString() + " soGioDinhMuc=" + soGioDinhMuc + "]";
	}
	
	
	
}
