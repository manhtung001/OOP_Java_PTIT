package bai3_max_min_sum;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Integer> list;
    int cauhoi;
    int dapan;
    private int index;
    private boolean running;

    public Data() {
        running = true;
        index = 1;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(int cauhoi) {
        this.cauhoi = cauhoi;
    }
    
    
    
    public int getDapan() {
        return dapan;
    }

    public void setDapan(int dapan) {
        this.dapan = dapan;
    }
    
    

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
    
}
