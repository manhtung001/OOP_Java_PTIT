package bailamcuoi;

public class IntPhone extends Phone implements IViet{
    private String maquocgia;
    
    public IntPhone(String maqg, String ma, String noi){
        super(ma, noi);
        this.maquocgia = maqg;
    }

    public String getMaquocgia() {
        return maquocgia;
    }

    public void setMaquocgia(String maquocgia) {
        this.maquocgia = maquocgia;
    }
    
    @Override
    public void out() {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return this.maquocgia + "-" + this.getMavung().substring(1) + "-" + this.getNoivung();
    }

    
}
