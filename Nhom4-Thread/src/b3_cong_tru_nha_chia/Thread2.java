package b3_cong_tru_nha_chia;

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
                String temp[] = d.getAns();
                double a = Double.parseDouble(temp[0]);
                double b = Double.parseDouble(temp[1]);
                String operator = temp[temp.length - 1];
                double ans = 0;
                System.out.println(a + " " + operator + " " + b);
                switch (operator) {
                    case "+":
                        ans = a + b;
                        break;
                    case "-":
                        ans = a - b;
                        break;
                    case "x":
                        ans = a * b;
                        break;
                    case ":":
                        ans = a / b;
                        break;
                }
                d.setKetqua(ans);
                d.setIndex(3);
            }
        }
        System.out.println("T2 Stop");
        synchronized (d) {
            stop();
        }
    }
}
