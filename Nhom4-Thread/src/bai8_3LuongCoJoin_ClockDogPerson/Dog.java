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
public class Dog extends Thread {
    private int num;
    
    public Dog() {
        this.num = 5;
    }
    
    public void run() {
        while (num>=0) {            
             System.out.println("Watching!! Watching!!");
             try{
                Thread.sleep(1000);
             }catch(InterruptedException e){
                System.out.println(e);
            }   
            num--;
        }
        System.out.println("GO Go go");
    }
}
