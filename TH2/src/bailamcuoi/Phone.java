package bailamcuoi;

public class Phone implements IViet{
    private String mavung, noivung;
    
    public Phone(String ma, String noi){
        this.mavung = ma;
        this.noivung = noi;
    }

    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getNoivung() {
        return noivung;
    }

    public void setNoivung(String noivung) {
        this.noivung = noivung;
    }
    
    @Override
    public String toString(){
        return getMavung() + "-" + getNoivung();
    }

    @Override
    public void out() {
        System.out.println(this.toString());
    }
}
