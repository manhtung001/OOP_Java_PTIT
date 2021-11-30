package bai3_max_min_sum;

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
                if(so == d.dapan)
                    System.out.println("Ban tra loi dung");
                else
                    System.out.println("Ban tra loi sai");
                d.setIndex(1);
                
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}
