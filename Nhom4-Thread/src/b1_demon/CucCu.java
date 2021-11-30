package b1_demon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CucCu extends Thread {

    @Override
    public void run() {
        SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss");
        while (true) {
            try {
                Date e = new Date();
                String ans = t.format(e).toString();
                int len = ans.length();
                if (ans.charAt(len-1) == ans.charAt(len-2))
                    break;
                else
                    System.out.println(ans);
                System.out.println("cuc cu");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
