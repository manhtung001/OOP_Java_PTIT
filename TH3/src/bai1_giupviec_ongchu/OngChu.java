package bai1_giupviec_ongchu;

public class OngChu extends Thread{

    public OngChu() {
        
    }
    
    @Override
    public void run(){
        for(int i =1; i<=4; i++){
            System.out.println("Ông chủ kiểm tra tầng " + i);
            if(i == 4)
                System.out.println("Ông chủ kiểm tra xong");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}