package b3_cong_tru_nha_chia;

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
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap cau tra loi: ");
                double ans = sc.nextDouble();
                if (ans == d.getKetqua()){
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
        System.out.println("T3 Stop");
        synchronized(d) {
            stop();
        }
    }
}
