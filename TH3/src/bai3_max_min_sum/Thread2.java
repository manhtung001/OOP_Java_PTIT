package bai3_max_min_sum;

public class Thread2 extends Thread{
    Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    
    @Override
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
                
                if(!d.isRunning())
                    break;
                
//                code
                
                    if(d.getCauhoi() == 0){
                        int min = d.list.get(0);
                        for(Integer j : d.list){
                            min = Math.min(j, min);
                        }
                        d.setDapan(min);
                    }
                    if(d.getCauhoi() == 1){
                        int max = d.list.get(0);
                        for(Integer j : d.list){
                            max = Math.max(j, max);
                        }
                        d.setDapan(max);
                    }
                    if(d.getCauhoi() == 2){
                        int sum = 0;
                        for(Integer j : d.list){
                            sum += j;
                        }
                        d.setDapan(sum);
                    }
                

                System.out.println();
                d.setIndex(3);
                
            }
        }
        System.out.println("T2 STOP");
        synchronized(d){
            stop();
        }
    }
}
