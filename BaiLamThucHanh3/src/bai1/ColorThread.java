package bai1;

public class ColorThread extends Thread{

    public ColorThread() {
        
    }
    
   @Override
    public void run() {
        String[] mau = {"do", "vang", "xanh"};
        int index = 0;
        while (true) {
            try {
                int tmp = index % 3;
                if(tmp == 0 ) {
                    System.out.println("\033[31m do");
                } else if (tmp == 1) {
                    System.out.println("\033[33m vang");
                } else {
                System.out.println("\033[34m xanh");
                }
                index += 1;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}