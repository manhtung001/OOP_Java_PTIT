package bai1_giupviec_ongchu;

public class Main {

    public static void main(String[] args) {
        GiupViec gv = new GiupViec();
        OngChu ongchu = new OngChu();
        BaChu bachu = new BaChu();
        gv.start();
        
        try{
            gv.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        ongchu.start();
        try{
            ongchu.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        bachu.start();
    }
    
}
