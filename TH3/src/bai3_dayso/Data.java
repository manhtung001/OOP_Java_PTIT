package bai3_dayso;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Integer> list;
    int dapan, diem;
    private int index;
    private boolean running;
    private String ans;

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Data() {
        running = true;
        index = 1;
        diem = 0;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
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
