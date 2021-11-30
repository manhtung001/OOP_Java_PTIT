/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author GL75
 */
public class MainTxt {
        public static void main(String[] args) {
            String filename="src/IOFile/hanoi.txt";
            
//            File f = new File(filename);
//            System.out.println(f.getAbsoluteFile());
//            System.out.println(f.getName());
//            System.out.println(new Date(f.lastModified()));
//            System.out.println(f.length());
            
//            FileReader r;
//            try {
//                r = new FileReader(filename);
//                int k;
//                while (true) {
//                    k = r.read();
//                    if (k==-1) {
//                        break;
//                    }
//                    char c = (char)k;
//                    System.out.print(c);
//                }
//                r.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(e);
//            } catch (IOException e) {
//                System.out.println(e);
//            }

            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = "";
                while((line=br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch(FileNotFoundException e) {
                System.out.println(e);
            } catch(IOException e) {
                System.out.println(e);
            }
    }
}
