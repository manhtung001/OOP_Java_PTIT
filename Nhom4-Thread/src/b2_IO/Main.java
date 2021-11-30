package b2_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("src/b2_IO/in.txt"));
            File f = new File("src/b2_IO/out.txt");
            if (!f.exists())
                f.createNewFile();
            bw = new BufferedWriter(new FileWriter("src/b2_IO/out.txt", true));
            String line = br.readLine();
            int total = Integer.parseInt(line);
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    int dem = 0;
                    while (num % i == 0) {
                        num /= i;
                        dem++;
                    }
                    if (dem >= 1) {
                        bw.write(Integer.toString(i));
                        bw.write("(");
                        bw.write(Integer.toString(dem));
                        bw.write(") ");
                        dem = 0;
                    }
                }
                if (num > 1) {
                    bw.write(Integer.toString(num));
                    bw.write("(1)\n");
                }
                else {
                    bw.write("\n");
                }
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
