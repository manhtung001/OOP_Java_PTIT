package b3_cong_tru_nha_chia;

public class Data {
    private String ans[];
    private boolean running;
    private int index, diem;
    private double ketqua;
    
    
    public Data() {
        diem = 0;
        index = 1;
        running = true;
    }

    public String[] getAns() {
        return ans;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public double getKetqua() {
        return ketqua;
    }

    public void setKetqua(double ketqua) {
        this.ketqua = ketqua;
    }

    public void setAns(String[] ans) {
        this.ans = ans;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
