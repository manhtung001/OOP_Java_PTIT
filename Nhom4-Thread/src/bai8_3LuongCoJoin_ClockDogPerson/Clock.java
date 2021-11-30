/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_3LuongCoJoin_ClockDogPerson;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GL75
 */
public class Clock extends Thread {
    private int num;
    
    public Clock() {
        this.num = 5;
    }
    
    public void run() {
        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
        while (num>=0) {            
             System.out.println("\33[34m"+f.format(new Date()));
             try{
                Thread.sleep(1000);
             }catch(InterruptedException e){
                System.out.println(e);
            }   
            num--;
        }
    }
}
