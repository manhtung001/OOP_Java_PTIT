/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author GL75
 */
public class QLPTGT implements ChucNang {
    
    private List<PTGT> list;
    private Scanner in = new Scanner(System.in);

    public QLPTGT() {
        list = new ArrayList<>();
        list.add(new Oto("HN876", "yaris", 2021, 800000, "do", "cho nu", 4));
        list.add(new Oto("HN111", "kia", 2021, 120000, "do", "cho nu", 7));
        list.add(new Oto("HN999", "civic", 2000, 900000, "bac", "cho nu", 16));
        list.add(new Oto("HN666", "yaris", 2012, 30000, "xanh", "cho nu", 7));
        list.add(new XeMay("HN821", "vision", 2014, 38000, "bac", 150));
        list.add(new XeMay("HN881", "spacy", 2000, 10000, "trang", 200));

    }
    
    private int tontai(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }
    
    private PTGT nhap() {
        String reg = "^HN\\d{3}";
        String ma;
        while(true) {
            System.out.println("Ma:");
            ma=in.nextLine().toLowerCase();
            if(ma.matches(reg) && tontai(ma) == -1)
                break;
            System.err.println("nhap lai!!!");
        }
        System.out.println("Hang:");
        String h=in.nextLine();
        System.out.println("nam:");
        int nam=Integer.parseInt(in.nextLine());
        System.out.println("gia:");
        double gia=Double.parseDouble(in.nextLine());
        System.out.println("Mau:");
        String mau=in.nextLine();
        
        return new PTGT(ma, h, nam, gia, mau);
    }
    

    @Override
    public void NhapOto() {
        PTGT p = nhap();
        System.out.println("Kieu:");
        String kieu=in.nextLine();
        System.out.println("so cho:");
        int socho=Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(), kieu, socho));
    }
    
    @Override
    public void NhapXeMay() {
        PTGT p = nhap();
        System.out.println("cong suat:");
        double cs=Double.parseDouble(in.nextLine());
        list.add(new XeMay(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(), cs));
    }

    @Override
    public void VietDS() {
        System.out.println("DS Oto");
        for(PTGT i:list)
            if (i instanceof Oto) 
                System.out.println(i);
        
       System.out.println("DS XeMay");
        for(PTGT i:list)
            if (i instanceof XeMay) 
                System.out.println(i);
       System.out.println("------------------------");
    }

    @Override
    public void xoa() {
        System.out.println("go vao ma de xoa:");
        String ma = in.nextLine();
        int vt=tontai(ma);
        if(vt == -1)
            System.out.println("co dau ma xoa!!!!");
        else {
            list.remove(vt);
            System.out.println("xoa thanh cong!!");
        }
    }

    @Override
    public void sua() {
        System.out.println("go vao ma de sua:");
        String ma = in.nextLine();
        int vt=tontai(ma);
        if(vt == -1)
            System.out.println("co dau ma sua!!!!");
        else {
            PTGT p = list.get(vt);
            System.out.println("Hang:");
            String h=in.nextLine();
            System.out.println("nam:");
            int nam=Integer.parseInt(in.nextLine());
            System.out.println("gia:");
            double gia=Double.parseDouble(in.nextLine());
            System.out.println("Mau:");
            String mau=in.nextLine();
            p.setHang(h);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            System.out.println("sua thanh cong!!");
        }
    }
    
    public void suaXeMay() {
        List<XeMay> l = new ArrayList<>();
        for(PTGT i:list)
            if(i instanceof XeMay)
                l.add((XeMay)i);
        
        System.out.println("go vao ma xe may de sua:");
        String ma = in.nextLine();
        
        int flag = 0;
        
        for (int i = 0; i < l.size(); i++) {
            XeMay x = l.get(i);
            
             if(x.getMa().equalsIgnoreCase(ma)) {
                flag = 1;
                System.out.println("Hang:");
                String h=in.nextLine();
                System.out.println("nam:");
                int nam=Integer.parseInt(in.nextLine());
                System.out.println("gia:");
                double gia=Double.parseDouble(in.nextLine());
                System.out.println("Mau:");
                String mau=in.nextLine();
                System.out.println("nhap vao cong suat:");
                double cs = Double.parseDouble(in.nextLine());
                x.setHang(h);
                x.setNam(nam);
                x.setGia(gia);
                x.setMau(mau);
                x.setCongsuat(cs);
                System.out.println("sua thanh cong!!");
            }
        }
        if(flag == 0)
            System.out.println("khong tim thay de sua!!");
    }

    @Override
    public void TimTheoMa() {
        System.out.println("go vao ma de tim:");
        String ma = in.nextLine();
        int vt=tontai(ma);
        if(vt == -1)
            System.out.println("khong tim thay!!");
        else {
            System.out.println("Doi tuong la:");
            System.out.println(list.get(vt));
        }
    }

    @Override
    public void TimTheoHang() {
        System.out.println("go vao hang de tim:");
        String h = in.nextLine().toLowerCase();
        
        boolean flag=false;
                
        for(PTGT i:list)
            if(i.getHang().toLowerCase().contains(h)){  // tim chua'
                System.out.println(i);
                flag = true;
            }
        if(!flag) 
            System.out.println("khong tim thay phuong tien nao ca!!!");
    }
    
    @Override
    public void TimTheoMau() {
        System.out.println("go vao mau de tim:");
        String m = in.nextLine();
        
        boolean flag=false;
                
        for(PTGT i:list)
            if(i.getMau().equalsIgnoreCase(m)){     // tim chinh xac
                System.out.println(i);
                flag = true;
            }
        if(!flag) 
            System.out.println("khong tim thay phuong tien nao ca!!!");
    }

    @Override
    public void TimTheoNam() {
        // tu nam ... den nam ...
        System.out.print("nhap tu nam can tim: ");
        int n1 = Integer.parseInt(in.nextLine());
        System.out.print("nhap den nam can tim: ");
        int n2 = Integer.parseInt(in.nextLine());
        
        boolean flag=false;
                
        for(PTGT i:list)
            if(i.getNam() >= n1 && i.getNam() <= n2){     
                System.out.println(i);
                flag = true;
            }
        if(!flag) 
            System.out.println("khong tim thay phuong tien nao ca!!!");
    }

    @Override
    public void TimTheoGiaCao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void TimTheoSoCho() {
        List<Oto> l = new ArrayList<>();
        for(PTGT i:list) {
            if(i instanceof Oto) 
                l.add((Oto)i);
        }
        System.out.print("nhap vao so cho can tim: ");
        int sc = Integer.parseInt(in.nextLine());
        
        boolean flag=false;
        
        for(Oto i:l) {
            if(i.getSocho() == sc) {
                System.out.println(i);
                flag = true;
            }
        }
        if(!flag) 
            System.out.println("khong tim thay phuong tien nao ca!!!");
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list);
        System.out.println("da sap xep tang dan theo ma");
    }
    
    public void sapxepTheoCongSuat() {
        // chi xe may - giam dam
         List<XeMay> l = new ArrayList<>();
        for(PTGT i:list)
            if(i instanceof XeMay)
                l.add((XeMay)i);
        
        l.sort(new Comparator<XeMay>() {
             @Override
             public int compare(XeMay o1, XeMay o2) {
                 return Double.compare(o2.getCongsuat(), o1.getCongsuat());
             }
            
        });
         for (XeMay i : l) {
            System.out.println(i);
        }
    }
    
    public void sapxepTheoMauVaGia(){
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if(o1.getMau() == o2.getMau())
                    return Double.compare(o1.getGia(), o2.getGia());
                else   
                    return o1.getMau().compareToIgnoreCase(o2.getMau());
            }
        });
    }


    @Override
    public void sapxepTheoNam() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o2.getNam() - o1.getNam();
            }
            
        });
    }

    @Override
    public void sapxepTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoGiaGiamDan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoSoCho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoNamvaGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // moi nam co bnhieu PT
    public  void countTheoNam() {
        Map<Integer, Long> count=list.stream().collect(Collectors.groupingBy(
                PTGT::getNam, Collectors.counting()));
        System.out.println(count);
    }
    
    // moi mau co bnhieu PT
    public void countTheoMau() {
        Map<String, Long> count=list.stream().collect(Collectors.groupingBy(
                PTGT::getMau, Collectors.counting()));
        System.out.println(count);
    }
    
    // tinh tong gia ban theo nam
    public void sumByNam() {
        Map<Integer, Double> count=list.stream().collect(Collectors.groupingBy(
                PTGT::getNam, Collectors.summingDouble(PTGT::getGia)));
        System.out.println(count);
    }
    
    // max - min
    public  void maxTheoGia() {
        Optional<PTGT> max = list.stream().collect(Collectors.maxBy(
            Comparator.comparing(PTGT::getGia)));
        System.out.println(max.isPresent() ? max.get() : "DS rong");
    }
    
    // max - min theo nhom
    public  void maxTheoMau() {
        Map<String, PTGT> o = list.stream().collect(Collectors.groupingBy(
                PTGT::getMau, Collectors.collectingAndThen(
                        Collectors.reducing((PTGT p1, PTGT p2) -> p1.getGia()>p2.getGia()
                            ?p1:p2), Optional::get)));
        Iterator i = o.keySet().iterator();
        while(i.hasNext()) {
            String key = (String)i.next();
            PTGT value=o.get(key);
            System.out.println(key);
            System.out.println(value);
        }
    }

    @Override
    public void thongke() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
