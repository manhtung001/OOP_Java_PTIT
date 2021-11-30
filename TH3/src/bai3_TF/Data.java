
package bai3_TF;

public class Data {
    private String CauHoi;
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

    public String getCauHoi() {
        return CauHoi;
    }

    public void setCauHoi(String CauHoi) {
        this.CauHoi = CauHoi;
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