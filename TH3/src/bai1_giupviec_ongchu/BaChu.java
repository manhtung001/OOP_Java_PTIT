package bai1_giupviec_ongchu;

public class BaChu extends Thread{

    public BaChu() {
        
    }

    @Override
    public void run(){
        for(int i =1; i<=4; i++){
            System.out.println("Bà chủ lên tầng " + i);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
