import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLGD implements IChucNang {
	public ArrayList<GiangVien> list;
	public Scanner sc = new Scanner(System.in);
	
	public QLGD() {
		list = new ArrayList<GiangVien>();
		list.add(new GVCoHuu("1", "Nguyen Manh Cuong", 1, 12));
		list.add(new GVCoHuu("2", "Nguyen Van A", 3, 4));
		list.add(new GVCoHuu("3", "Nguyen Van B", 3, 22));
		list.add(new GVCoHuu("4", "Nguyen Van C", 2, 7));
		list.add(new GVCoHuu("5", "Nguyen Van D", 1, 47));
		list.add(new GVTGiang("6", "Nguyen Manh M", 11, 1));
		list.add(new GVTGiang("6", "Nguyen Manh N", 44, 1));
		list.add(new GVTGiang("6", "Nguyen Manh X", 55, 2));
		list.add(new GVTGiang("6", "Nguyen Manh Y", 11, 3));
		for(GiangVien g : list) {
			if(g instanceof GVCoHuu) {
				((GVCoHuu)g).getTienLinh();
			}
			else {
				((GVTGiang)g).getTienLinh();
			}
		}
		System.out.println(list);
	}

	@Override
	public void nhapGVCoHuu() {
		GVCoHuu g = new GVCoHuu();
		String ma = "";
		boolean flag = true;
        while(flag) {
        	System.out.println("Nhap ma: ");
        	ma = sc.nextLine();
        	flag = false;
        	for(GiangVien l : list) {
        		if(l.ma.equals(ma)) {
        			System.out.println("Ma Trung!!!");
        			flag = true;
        			break;
        		}
        	}
        }
        g.setMa(ma);
        
        System.out.println("Nhap Ten: ");
        g.setTen(sc.nextLine());
        
        String hocVi = "";
        do {
        	System.out.println("Nhap hoc vi(1, 2, 3): ");
        	hocVi = sc.nextLine();
        	if(!hocVi.matches("\\d+")) {
        		System.out.println("Vui long nhap dung!");
        		hocVi = "0";
        	}
        } while(Integer.parseInt(hocVi) > 3 || Integer.parseInt(hocVi) < 1);
        
        g.setHocVi(Integer.parseInt(hocVi));

        System.out.println("Nhap So Gio Dinh Muc: ");
        g.setSoGioDinhMuc(Integer.parseInt(sc.nextLine()));
        
        g.getTienLinh();
        list.add(g);
		
	}

	@Override
	public void nhapGVThinhGiang() {
		GVTGiang g = new GVTGiang();
		String ma = "";
		boolean flag = true;
        while(flag) {
        	System.out.println("Nhap ma: ");
        	ma = sc.nextLine();
        	flag = false;
        	for(GiangVien l : list) {
        		if(l.ma.equals(ma)) {
        			System.out.println("Ma Trung!!!");
        			flag = true;
        			break;
        		}
        	}
        }
        g.setMa(ma);
        
        System.out.println("Nhap Ten: ");
        g.setTen(sc.nextLine());
        
        String hocVi = "";
        do {
        	System.out.println("Nhap hoc vi(1, 2, 3): ");
        	hocVi = sc.nextLine();
        	if(!hocVi.matches("\\d+")) {
        		System.out.println("Vui long nhap dung!");
        		hocVi = "0";
        	}
        } while(Integer.parseInt(hocVi) > 3 || Integer.parseInt(hocVi) < 1);
        
        g.setHocVi(Integer.parseInt(hocVi));
        
        System.out.println("Nhap So Gio: ");
        g.setSoGio(Integer.parseInt(sc.nextLine()));

        
        g.getTienLinh();
        list.add(g);
		
		
	}

	@Override
	public void inToanBoDS() {
		double sum = 0; 
		for(GiangVien l : list) {
			System.out.println(l);
			sum += l.getTien();
		}
		System.out.println("Tong Tien: " + sum);
	}

	@Override
	public void sxGVTheoTinhLinhGiamDan() {
		list.sort(new Comparator<GiangVien>() {

			@Override
			public int compare(GiangVien o1, GiangVien o2) {
				return Double.compare(o2.getTien(), o1.getTien());
			}
		
		});
		
	}
	
	

	@Override
	public void tongTienPhaiTraTheoHocVi() {
		Map<Integer, Double> sum=list.stream().collect(
				Collectors.groupingBy(
						GiangVien::getHocVi,
						Collectors.summingDouble(GiangVien::getTien)
				)
		);
		System.out.println(sum);
		
	}

	@Override
	public void xoaTheoMa() {
		String ma = "";
		boolean flag = true;
        while(flag) {
        	System.out.println("Nhap ma: ");
        	ma = sc.nextLine();
        	for(GiangVien l : list) {
        		if(l.ma.equals(ma) && l instanceof GVTGiang) {
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag == false) {
        		System.out.println("khong ton tai ma nay!!!");
        	}
        }
	}

}
