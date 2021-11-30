package bai1;

public class ChiaHet7 extends Thread {
    
    public ChiaHet7() {
        
    }

    @Override
    public void run() {
        int so = 7;
        while (true) {
            try {
                System.out.println(so);
                so += 7;
                if (so == 77) {
                break;
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

