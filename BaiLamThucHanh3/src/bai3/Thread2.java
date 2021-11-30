package bai3;

import java.util.ArrayList;
import java.util.List;

public class Thread2 extends Thread {

    private Data d;

    public Thread2(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (d) {
                d.notifyAll();
                while (d.getIndex() != 2 && d.isRunning()) {
                    try {
                        d.wait();
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if (d.isRunning() == false) {
                    break;
                }
                String tmpLine[] = d.getLine().split("\\;");
                String ten = tmpLine[0];
                String tmpDiem[] = tmpLine[1].trim().split("\\s+");
                List<Integer> dayso = new ArrayList<>();
                    for (String i : tmpDiem) {
                        dayso.add(Integer.parseInt(i));
                    }
                d.setList(dayso);
                d.setTen(ten);
                d.setIndex(3);
            }
        }
        System.out.println("T2 Stop");
        synchronized (d) {
            stop();
        }
    }
}
