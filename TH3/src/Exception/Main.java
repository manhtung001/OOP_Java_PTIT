/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author GL75
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
	
            SinhVien s = null;
		
//            try {
//                s = new SinhVien(10, "AAA");
//            } catch (KhongRongException e) {
//                    System.out.println(e);
//            } catch (SoDuongException e) {
//                    System.out.println(e);
//            } 
//                System.out.println(s);

            int ma = 0;
            String ten="";
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            try {
                // ma
                while (true) {                    
                    try {
                        System.out.println("ma:");
                        ma=Integer.parseInt(b.readLine());
                        if (ma<=0) {
                            throw new SoDuongException("ma so duong");
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.err.println(e);
                    } catch (SoDuongException e) {
                        System.err.println(e);
                    }
                }
                
                while (true) {                    
                    try {
                        System.out.println("ten:");
                        ten=b.readLine();
                        if (ten.isEmpty()) {
                            throw new KhongRongException("ten khong de rong");
                        }
                        break;
                    } catch (KhongRongException e) {
                        System.err.println(e);
                    }
                }
            } catch (IOException e) {
                System.err.println("e");
            }
            s = new SinhVien(ma, ten);
            System.out.println(s);
	}
}

