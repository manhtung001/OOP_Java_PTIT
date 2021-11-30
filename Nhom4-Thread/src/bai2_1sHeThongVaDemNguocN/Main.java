/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_1sHeThongVaDemNguocN;

import java.util.Scanner;

/**
 *
 * @author GL75
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("nhap vao 1 so: ");
        int n=Integer.parseInt(in.nextLine());
        
        Thread1 t1 = new Thread1(n);
        Thread2 t2 = new Thread2(n);
        
        t1.start();
        t2.start();
    }
}
