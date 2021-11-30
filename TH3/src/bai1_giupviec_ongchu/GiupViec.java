package bai1_giupviec_ongchu;


public class GiupViec extends Thread{
    
    public GiupViec() {
        
    }
    
    @Override
    public void run(){
        for(int i =1; i<=4; i++){
            System.out.println("Giúp việc lau tầng " + i);
            if(i == 4)
                System.out.println("Giúp việc đã lau xong nhà");
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
