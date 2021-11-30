/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_TF;

/**
 *
 * @author pa031
 */
import java.util.Scanner;


public class Thread3 extends Thread{
    Data d;

    public Thread3(Data d) {
        this.d = d;
    }
    
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=3 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                
                if(!d.isRunning())
                    break;
                
//                code
                System.out.print("Nhap cau tra loi: ");
                int so = sc.nextInt();
                if(so == d.dapan) {
                    System.out.println("Tra loi dung!");
                    d.setDiem(d.getDiem()+1);
                    System.out.println("Diem: " + d.getDiem());
                }
                else {
                        System.out.println("Tra loi sai!");
                        System.out.println("Diem: " + d.getDiem());
                }
                d.setIndex(1);
                
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}