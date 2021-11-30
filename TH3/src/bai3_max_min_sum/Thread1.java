package bai3_max_min_sum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Thread1 extends Thread{
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    
    @Override
    public void run(){
//        try{
//            sleep(1000);
//        }catch(InterruptedException e){
//            System.out.println(e);
//        }
        
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("src/bai3_max_min_sum/cauhoi.txt"));
            synchronized(d){
                String line = null;
                while((line = br.readLine()) != null){
                    String[] tach = line.split("\\:");
                    String[] day = tach[0].trim().split("\\s+");
                    int cauhoi = 0;
                    int len = tach[1].length();
                    System.out.println(tach[0].trim());
                    if(tach[1].charAt(6)=='0'){
                        cauhoi = 0;
                        System.out.println("min day so?");
                    }
                    if(tach[1].charAt(6)=='1'){
                        cauhoi = 1;
                        System.out.println("max day so?");
                    }
                    if(tach[1].charAt(6)=='2'){
                        cauhoi = 2;
                        System.out.println("sum day so?");
                    }
                    List<Integer> dayso = new ArrayList<>();
                    for (String i : day) {
                        dayso.add(Integer.parseInt(i));
                
                    }
                    
                    d.setList(dayso);
                    d.setCauhoi(cauhoi);
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
                br.close();
                d.setRunning(false);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        System.out.println("T1 STOP");
        synchronized(d){
            d.notifyAll();
            stop();
        }
    }
}

