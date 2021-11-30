/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_3LuongCoJoin_ClockDogPerson;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Clock c=new Clock();
        Dog d=new Dog();
        Person p=new Person();
        
        d.start();
        c.start();
        try{
            d.join();
            c.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }
        p.start();
    }
}
