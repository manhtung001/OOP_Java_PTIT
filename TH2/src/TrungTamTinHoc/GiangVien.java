
public class GiangVien {
	protected String ma, ten;
	protected int hocVi;
	protected double tien;
	
	public GiangVien() {
		// TODO Auto-generated constructor stub
	}
	
	

	public GiangVien(String ma, String ten, int hocVi) {
		this.ma = ma;
		this.ten = ten;
		this.hocVi = hocVi;
	}



	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	

	public int getHocVi() {
		return hocVi;
	}



	public void setHocVi(int hocVi) {
		this.hocVi = hocVi;
	}

	public double getTien() {
		return tien;
	}


	@Override
	public String toString() {
		String hoc = "";
		if(hocVi == 1) hoc = "Dai hoc";
		else if(hocVi == 2) hoc = "tien si";
		else hoc = "thac si";
		return "GiangVien [ma=" + ma + ", ten=" + ten + ", tienLinh=" + tien + ", hocVi=" + hoc
				+ "]";
	}




	
	
	
}
