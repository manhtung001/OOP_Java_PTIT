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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Thread1 extends Thread{
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }

    
    @Override
    public void run(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("src/bai3_TF/cauhoi.txt"));
            synchronized(d){
                
                String line = null;
                while((line = br.readLine()) != null){
                    d.setAns(line);
                    d.setIndex(2);
                    d.notifyAll();
                    d.wait();
                    sleep(1000);
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