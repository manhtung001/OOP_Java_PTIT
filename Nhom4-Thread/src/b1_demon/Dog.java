package b1_demon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dog extends Thread{
    @Override
    public void run() {
        SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss");
        while (true) {

            System.out.println("Gau gau");
            Date e = new Date();
            String ans = t.format(e).toString();
            int len = ans.length();
            if (ans.charAt(len-1) == ans.charAt(len-2))
            {
                 System.out.println("wow wow");
//                 break;
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
    }
   
}
