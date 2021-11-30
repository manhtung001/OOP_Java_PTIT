/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QLGD q = new QLGD();
        while(true){
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1. Nhap GV Co Huu");
            System.out.println("2. Nhap GV Thinh Giang ");
            System.out.println("3. Viet ra toan bo, co tong ");
            System.out.println("4. SX GV Theo Tien Linh");
            System.out.println("5. Xoa GV Thinh Giang theo ma ");
            System.out.println("6. Dua ra tong phai tra theo Hoc Vi ");

            System.out.println("0. Exit!");
            System.out.println("--------------------------------------------------");
            System.out.print("Choose from 0 to 6: ");
            int choose = Integer.parseInt(in.nextLine());
            switch(choose){
                case 0:System.out.println("Bye!!!");
                       System.exit(0);//safe exit
                    //break;
                case 1:
                    q.nhapGVCoHuu();
                    break;
                case 2:
                	q.nhapGVThinhGiang();
                    break;
                case 3:
                    q.inToanBoDS();
                    break;    
                case 4:
                    q.sxGVTheoTinhLinhGiamDan();
                    break;
                case 5:
                    q.xoaTheoMa();
                    break;
                case 6:
                    q.tongTienPhaiTraTheoHocVi();
                    break;
               
                default:
                    System.out.println("Please choose from 0 to 6!");    
            }

        }
    }
}
