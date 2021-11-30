package bai3;

import java.util.List;
import java.util.Scanner;

public class Thread3  extends Thread{
    private Data d;
    
    public Thread3(Data d){
        this.d = d;
    }
    
    @Override
    public void run() {
        while (true) {
            synchronized(d) {
                d.notifyAll();
                while (d.getIndex() != 3 && d.isRunning()) {
                    try {
                        d.wait();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                
                if (d.isRunning() == false)
                    break;
//                Scanner sc = new Scanner(System.in);
                System.out.println("-------------------------------");
                System.out.println(d.getTen());
                List<Integer> list = d.getList();
                double gpa = 0;
                System.out.print("Điểm từng môn: ");
                for (Integer i : list) {
                        gpa += (double)i;
                        System.out.print(i + " ");
                    }
                System.out.println();
                gpa /= 3;
                System.out.print("Học lực: ");
                if (gpa < 5){
                    System.out.println("Yếu");
                }
                else if ( gpa < 6.5) {
                    System.out.println("Trung Bình");
                } else if ( gpa < 8) {
                    System.out.println("Khá");
                } else {
                System.out.println("Giỏi");
                }
                d.setIndex(1);
            }
        }
        System.out.println("T3 Stop");
        synchronized(d) {
            stop();
        }
    }
}
