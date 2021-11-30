
public class GVTGiang extends GiangVien implements ITinhLuong {

	private int soGio;
	
	public GVTGiang() {
		// TODO Auto-generated constructor stub
	}
	
	
	public GVTGiang(String ma, String ten, int soGio, int hocVi) {
		super(ma, ten, hocVi);
		this.soGio = soGio;
	}


	public int getSoGio() {
		return soGio;
	}


	public void setSoGio(int soGio) {
		this.soGio = soGio;
	}


	@Override
	public void getTienLinh() {
		this.tien = this.soGio * this.hocVi * 160;
		
	}



	@Override
	public String toString() {
		return "GVTGiang [" + super.toString() + " soGio=" + soGio + "]";
	}
	
	
}
