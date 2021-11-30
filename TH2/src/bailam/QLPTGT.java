package bailam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLPTGT implements ChucNang {

    private List<PTGT> list;
    private final Scanner sc = new Scanner(System.in);

    public QLPTGT() {
        list = new ArrayList<>();
    }

    private PTGT nhap() {
        String regex = "^AB\\d{2}$";
        String soKhung;
        while (true) {
            System.out.print("Nhap so khung: ");
            soKhung = sc.nextLine();
            if (soKhung.matches(regex)) {
                break;
            } else {
                System.err.println("Nhap lai!");
            }
        }
        System.out.print("Nhap hang: ");
        String hang = sc.nextLine();
        System.out.print("Ngay lan banh: ");
        String ngayLanBanh = sc.nextLine();
        System.out.print("Gia: ");
        double gia = Double.parseDouble(sc.nextLine());
        PTGT temp = new PTGT(soKhung, hang, ngayLanBanh, gia);
        return temp;
    }

    @Override
    public void nhapOto() {
        PTGT temp = nhap();
        System.out.print("Nhap so cho: ");
        int soCho = Integer.parseInt(sc.nextLine());
        System.out.print("Toc do: ");
        double tocDo = Double.parseDouble(sc.nextLine());
        list.add(new Oto(temp.getSoKhung(), temp.getHang(), temp.getNgayLanBanh(), temp.getGia(), soCho, tocDo));
    }

    @Override
    public void nhapXeTai() {
        PTGT temp = nhap();
        System.out.print("Nhap tai trong: ");
        double taiTrong = Double.parseDouble(sc.nextLine());
        System.out.print("Co thung xe?: ");
        String choice = sc.nextLine();
        boolean thungXe;
        if (choice.equalsIgnoreCase("True")) {
            thungXe = true;
        } else {
            thungXe = false;
        }
        list.add(new XeTai(temp.getSoKhung(), temp.getHang(), temp.getNgayLanBanh(), temp.getGia(), taiTrong, thungXe));
    }

    @Override
    public void vietDS() {
        System.out.println("Danh sach OTO:");
        int dem = 0;
        for (PTGT ptgt : list) {
            if (ptgt instanceof Oto) {
                System.out.println(ptgt);
                dem++;
            }
        }
        System.out.println("Tong so " + dem + " oto");
        dem = 0;
        System.out.println("-----------------");
        System.out.println("Danh sach xe tai:");
        for (PTGT ptgt : list) {
            if (ptgt instanceof XeTai) {
                dem++;
                System.out.println(ptgt);
            }
        }
        System.out.println("Tong so " + dem + " xe tai");
    }

    private PTGT tonTai(String ma) {
        for (PTGT ptgt : list) {
            if (ptgt.getSoKhung().equalsIgnoreCase(ma)) {
                return ptgt;
            }
        }
        return null;
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma xe can sua: ");
        String ma = sc.nextLine();
        if (tonTai(ma) == null) {
            System.err.println("Khong tim thay!");
        } else {
            PTGT temp = tonTai(ma);
            System.out.print("Nhap hang: ");
            String hang = sc.nextLine();
            System.out.print("Ngay lan banh: ");
            String ngayLanBanh = sc.nextLine();
            System.out.print("Gia: ");
            double gia = Double.parseDouble(sc.nextLine());
            temp.setHang(hang);
            temp.setNgayLanBanh(ngayLanBanh);
            temp.setGia(gia);
            System.out.println("Sua thanh cong!");
        }
    }

    @Override
    public void sapXepGiaGiam() {
        Collections.sort(list, new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return Double.compare(o2.getGia(), o1.getGia());
            }
        });
    }

    @Override
    public void duaRaPTGTDatDoTheoHang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
