package bailamcuoi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PhoneBook implements IChucNang{
    private List<Phone> list;
    private Scanner sc = new Scanner(System.in);
    
    public PhoneBook(){
        list = new ArrayList<>();
        list.add(new Phone("024", "36407515"));
        list.add(new Phone("0227", "12342136"));
        list.add(new IntPhone("84", "024", "36412515")); 
    }
    
    private Boolean tontai(String s){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNoivung().equals(s))
                return true;
        }
        return false;
    }
    
    @Override
    public void nhapNoiHat(){
        Phone x = null;
        String ma, noi;
        String re1 = "^0\\d{2,3}[-]\\d{8}$";
        while(true){
            System.out.print("Nhap ma vung: ");
            ma = sc.nextLine();
            System.out.print("Nhap noi vung: ");
            noi = sc.nextLine();
            x = new Phone(ma, noi);
            String sdt = ma+"-"+noi;
            if(!tontai(noi) && (sdt.matches(re1))){
                break;
            }
            System.err.println("Nhap lai!!!");
        }
        x = new Phone(ma, noi);
        list.add(x);
            
    }
    
    @Override
    public void nhapQuocTe(){
        IntPhone x = null;
        String maqg, ma, noi;
        String re1 = "^0\\d{2,3}[-]\\d{8}$";
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
        x = new IntPhone(maqg, ma, noi);
        list.add(x);
    }
    

    @Override
    public void lietKe() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); 
        }
        System.out.println("co " +list.size() + " sdt");
    }
    
    public void sua(){
        boolean check = false;
        System.out.println("nhap so dien thoai: ");
        String sdt = sc.nextLine();
        Phone x = null;
        for (Phone i : list) {
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
        if(x instanceof IntPhone){
            System.out.print("nhap ma quoc gia: ");
            String maqg = sc.nextLine();
            ((IntPhone) x).setMaquocgia(maqg);
        }
        list.add(x);
    }

    @Override
    public void tinhTongSDTTheoTungVung() {
        ArrayList<String> x = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!x.contains(list.get(i).getMavung())){
                x.add(list.get(i).getMavung());
            }
        }
        
        for (String i : x) {
            System.out.println("Ma vung " + i + ":");
            int dem = 0;
            for (int j = 0; j < list.size(); j++) {            
                if (list.get(j).getMavung().equals(i)){
                    dem++;
                }
            }
            System.out.println(dem + "so");
        }
    }


    @Override
    public void sapXepSDT() {
        Collections.sort(list, new Comparator<Phone>(){
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getMavung().compareTo(o2.getMavung());
            }
        });
    }

    @Override
    public void timKiemTheoCoDuoi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
