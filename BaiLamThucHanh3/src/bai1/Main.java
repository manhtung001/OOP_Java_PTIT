package bai1;

public class Main {

    public static void main(String[] args) {
        ChiaHet7 chiahet = new ChiaHet7();
        ColorThread color = new ColorThread();
        
        color.setDaemon(true);
        
        color.start();
        chiahet.start();
        
    }
    
}
