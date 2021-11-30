/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoDienThoai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GL75
 */
public class PhoneBook {
    
    private List<PhoneNumber> list;
    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {
        list = new ArrayList<>();
        list.add(new PhoneNumber("024", "36407515"));
        list.add(new PhoneNumber("0227", "12342136"));
        list.add(new IntlPhoneNumber("84", "024", "36412515")); 
    }
    
    private Boolean tontai(String s){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNoivung().equals(s))
                return true;
        }
        return false;
    }
    
    public void nhapTrongNuoc() {
        PhoneNumber x = null;
        String ma, noi;
        String re1 = "^\\d{3,4}-\\d+";
         while(true){
            System.out.print("Nhap ma vung: ");
            ma = sc.nextLine();
            System.out.print("Nhap noi vung: ");
            noi = sc.nextLine();
            x = new PhoneNumber(ma, noi);
            String sdt = ma+"-"+noi;
            if(!tontai(noi) && (sdt.matches(re1))){
                break;
            }
            System.err.println("Nhap lai!!!");
        }
        x = new PhoneNumber(ma, noi);
        list.add(x);
    }
    
    public void nhapQuocTe() {
        IntlPhoneNumber x = null;
        String maqg, ma, noi;
        String re1 = "^\\d+-\\d{3,4}-\\d+";
        while(true){
            System.out.print("Nhap quoc gia: ");
            maqg = sc.nextLine();
            System.out.print("Nhap ma vung: ");
            ma = sc.nextLine();
            System.out.print("Nhap noi vung: ");
            noi = sc.nextLine();
            String sdt = noi;
            String reg = ma + "-" + noi;
            if(!tontai(sdt) && (reg.matches(re1))){
                break;
            }
            System.err.println("Moi nhap lai!!!");
        }
        x = new IntlPhoneNumber(maqg, ma, noi);
        list.add(x);
    }
    
    public void lietKe() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); 
        }
    }
    
    public void sua(){
        boolean check = false;
        System.out.println("nhap so dien thoai: ");
        String sdt = sc.nextLine();
        PhoneNumber x = null;
        for (PhoneNumber i : list) {
            if(i.getNoivung().equals(sdt)){
                check = true;
                x = i;
                list.remove(i);
                break;
            }
        }
        if(check == false)
            System.out.println("co dau ma sua");
        
        System.out.print("nhap ma vung: ");
        String ma = sc.nextLine();
        x.setMavung(ma);
        x.setNoivung(sdt);
        if(x instanceof IntlPhoneNumber){
            System.out.print("nhap ma quoc gia: ");
            String maqg = sc.nextLine();
            ((IntlPhoneNumber) x).setMaquocgia(maqg);
        }
        list.add(x);
    }
    
     public void sapXepSDT() {
        Collections.sort(list, new Comparator<PhoneNumber>(){
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getMavung().compareTo(o2.getMavung());
            }
        });
    }
    
}
