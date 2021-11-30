/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_3LuongCoJoin_ClockDogPerson;

/**
 *
 * @author GL75
 */
public class Person extends Thread {
    private int num;
    
    public Person() {
        this.num = 1;
    }
    
    public void run() {
        System.out.println("WOW big dog!");
        while (num<=5) {         
             try{
                Thread.sleep(1000);
             }catch(InterruptedException e){
                System.out.println(e);
            }   
             System.out.println("Person: " + num*10);
            num++;
        }
    }
}
