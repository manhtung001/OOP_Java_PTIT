package bai3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread1 extends Thread{
    private Data d;
    
    public Thread1(Data d) {
        this.d = d;
    }
    
    @Override
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/bai3/sinhvien.txt"));
            synchronized(d) {
                String line =  null;
                while ((line = br.readLine()) != null) {
                    d.setLine(line);
                    d.setIndex(2);
                    d.notifyAll();
//                    d.wait();
                    while(d.getIndex()!=1 && d.isRunning()){
                                       try{
                                           d.wait();
                                       }catch(InterruptedException e){
                                           System.out.println(e);
                                       }
                    }
                    sleep(1000);
                }
                d.setRunning(false);
                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("T1 Stop");
        synchronized(d) {
          d.notifyAll();
          stop();
        }
    }
}
