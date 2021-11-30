package ktra2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLPTGT q = new QLPTGT();
        while (true) {
            System.out.println("------MENU-------");
            System.out.println("1. Nhap Oto");
            System.out.println("2. Nhap Xe May");
            System.out.println("3. Show");

            System.out.println("4. xoa");
            System.out.println("5. sua");
            System.out.println("6. sua xe may");

            System.out.println("7. tim theo ma");
            System.out.println("8. tim theo hang");
            System.out.println("9. tim theo mau");
            System.out.println("10. tim theo nam");
            System.out.println("11. tim theo so cho");

            System.out.println("12. sap xep thep ma");
            System.out.println("13. sap xep thep cong suat");
            System.out.println("14. sap xep thep mau va gia");
            
            System.out.println("15. dem so PT theo nam");
            System.out.println("16. dem so PT theo mau");
            
            System.out.println("17. tong gia ban theo nam");
            System.out.println("18. max theo gia ban");
            System.out.println("19. max gia theo mau");


            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Nhap lua chon cua ban: ");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);
                case 1:
                    q.NhapOto();
                    break;
                case 2:
                    q.NhapXeMay();
                    break;
                case 3:
                    q.VietDS();
                    break;
                case 4:
                    q.xoa();
                    break;
                case 5:
                    q.sua();
                    break;
                case 6:
                    q.suaXeMay();
                    break;
                case 7:
                    q.TimTheoMa();
                    break;
                case 8:
                    q.TimTheoHang();
                    break;
                case 9:
                    q.TimTheoMau();
                    break;
                case 10:
                    q.TimTheoNam();
                    break;
                case 11:
                    q.TimTheoSoCho();
                    break;
                case 12:
                    q.sapxepTheoMa();
                    break;
                case 13:
                    q.sapxepTheoCongSuat();
                    break;
                case 14:
                    q.sapxepTheoMauVaGia();
                    break;
                case 15:
                    q.countTheoNam();
                    break;
                case 16:
                    q.countTheoMau();
                    break;
                case 17:
                    q.sumByNam();
                    break;
                case 18:
                    q.maxTheoGia();
                    break;
                case 19:
                    q.maxTheoMau();
                    break;
                default:
                    System.out.println("Vui long chon 0->19");
                    break;
            }
        }
    }
}
