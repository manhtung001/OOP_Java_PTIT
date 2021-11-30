package bai3_dayso;

import java.util.ArrayList;
import java.util.List;

public class Thread2 extends Thread{
    Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    
    @Override
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                
                if(!d.isRunning())
                    break;
                    String[] tach = d.getAns().split("\\/");
                    String[] day = tach[0].trim().split("\\s+");
                    System.out.println(tach[0].trim());
                    List<Integer> dayso = new ArrayList<>();
                    for (String i : day) {
                        dayso.add(Integer.parseInt(i));
                    }
                    d.setList(dayso);
                    d.setDapan(Integer.parseInt(tach[1].trim()));
                    System.out.println();
                    d.setIndex(3);
                
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}
