package thongke;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        
        list.add(new SinhVien(1, "To An An", "05/10/2000"));
        list.add(new SinhVien(1, "Lai thi Tuen", "05/09/2000"));
        list.add(new SinhVien(1, "Vu Thu An", "05/11/2000"));
        list.add(new SinhVien(1, "Bui thanh Tu", "12/11/2000"));

        System.out.println("ds ban dau");
        
        for(SinhVien i:list)
            System.out.println(i);
        
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                
                // sap xep theo ho va ten
                // sx theo ten, neu ten giong nhau thi sx theo ho
                
                String[] t1 = o1.getHoten().split("\\s+");
                String n1=t1[t1.length - 1];
                
                String[] t2 = o2.getHoten().split("\\s+");
                String n2=t2[t2.length - 1];
                
                if(n1.equalsIgnoreCase(n2))
                    return o1.getHoten().compareToIgnoreCase(o2.getHoten());
                else
                    return n1.compareToIgnoreCase(n2);
            }
        });
        
        System.out.println("ds sau sx");
        
        for(SinhVien i:list)
            System.out.println(i);
    }
        
}
