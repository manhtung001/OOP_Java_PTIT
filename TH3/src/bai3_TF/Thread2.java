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
                    String[] tach = d.getAns().split("\\:");
//                    String[] day = tach[0].trim().split("\\s+");
                    System.out.println(tach[0].trim());
                    List<String> DA  = new ArrayList<>();
                    String CauHoi = tach[0].trim();
                    String DapAn = tach[1].trim();
                    String[] tach_da = DapAn.split("\\;");
                    DA.add(tach_da[0].trim());
                    DA.add(tach_da[1].trim());
                    DA.add(tach_da[2].trim());
                    System.out.println("Chon 1 trong 3 dap an:");
                    for (String s: DA){
                        String[] tach_tf = s.split("\\/");
                        System.out.print(tach_tf[0] + " ");
                        if(tach_tf[1].equals("T")){
                            d.setDapan(Integer.parseInt(tach_tf[0].trim()));
                        }
                    }
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