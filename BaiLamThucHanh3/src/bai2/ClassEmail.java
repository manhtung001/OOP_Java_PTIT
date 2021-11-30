package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ClassEmail {
    String filename = "src/bai2/in.txt";
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    public ClassEmail() {
        
    }
    
    public void Init(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = "";
            
            while((line = br.readLine()) != null){
                String[] s = line.toLowerCase().split("\\s+");
                
                String res = s[s.length-1];

                for (int i = 0; i < s.length-1; i++)
                    res += s[i].substring(0, 1);  

                list.add(res);
                int cnt = 0;
                for (int i = 0; i < list.size(); i++) {
                    if(res.equalsIgnoreCase(list.get(i))){
                        cnt += 1;
                    }
                }
                if(cnt == 1)
                    list2.add(res+"@ptit.edu.vn");
                else
                    list2.add(res+(cnt-1)+"@ptit.edu.vn");
               
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
        String fout = "src/bai2/out.txt";
        try{
            PrintWriter p = new PrintWriter(fout);
            for (String i : list2) {
                p.println(i);
            }
            p.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
