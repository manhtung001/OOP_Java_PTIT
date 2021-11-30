package bailamcuoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook q = new PhoneBook();
        
        while(true){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1. Nhap SDT trong nuoc");
            System.out.println("2. Nhap SDT Qte ");
            System.out.println("3. Viet ra toan bo, co tong ");
            System.out.println("4. Sua Sdt");
            System.out.println("5. Sap Xep theo ma vung");
            System.out.println("6. Dua SDT theo Vung");
            System.out.println("7. Tim kiem");

            System.out.println("0. Exit!");
            System.out.print("Ban chon (0->7):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon = Integer.parseInt(in.nextLine());
            switch(chon){
                case 0: System.out.println("BYE!!!");
                        System.exit(0);//safe exit
                case 1: q.nhapNoiHat();
                       break;
                case 2: q.nhapQuocTe();
                       break;
                case 3: q.lietKe();
                       break;
                case 4: q.sua();
                       break; 
                case 5: q.sapXepSDT();
                        q.lietKe();
                       break; 
                case 6: q.tinhTongSDTTheoTungVung();
                       break;
                case 7:
                    break;
                default:System.out.println("chi chon 0->7");
                      break; 
            }
        }
        
    }
    
}
