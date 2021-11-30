package bai2_bcnn_ucln;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CapSo {
    String filename = "src/bai2_bcnn_ucln/in.txt";
    List<String[] > list = new ArrayList<>();
    
    public CapSo() {
        
    }
    
    public long gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public void Init(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = "";
            
            while((line = br.readLine()) != null){
                String[] s = line.split("\\s+");
                list.add(s);
            }
            
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        
        
    }
    
    public void Out(){
        String fout = "src/bai2_bcnn_ucln/out.txt";
        try{
            PrintWriter p = new PrintWriter(fout);
            for(int i = 0; i < list.size(); i++){
                int a = Integer.parseInt(list.get(i)[0]);
                int b = Integer.parseInt(list.get(i)[1]);
                long uc = gcd(a, b);
                long bc = (a/uc)*b;
                p.println("(" + bc + " , " + uc + ")");
            }
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
