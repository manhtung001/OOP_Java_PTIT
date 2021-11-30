package bailam;


import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        QLPTGT q = new QLPTGT();
        while (true) {
            System.out.println("------MENU-------");
            System.out.println("1. Nhap Oto ");
            System.out.println("2. Nhap Xe Tai");
            System.out.println("3. Viet Danh Sach");

            System.out.println("4. Sua ");
            System.out.println("5. Sap xep theo gia giam dan");
            System.out.println("6. ");

            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->6):");
            int chon;
            Scanner in = new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(0);//safe exit
                case 1:
                   q.nhapOto();
                    break;
                case 2:
                   q.nhapXeTai();
                    break;
                case 3:
                    q.vietDS();
                    break;
                case 4:
                    q.sua();
                    break;
                case 5:
                   q.sapXepGiaGiam();
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                default:
                    System.out.println("chi chon 0->6");
                    break;
            }
        }

    }

}
