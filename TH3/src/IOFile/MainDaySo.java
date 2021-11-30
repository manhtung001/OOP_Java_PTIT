/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author GL75
 */
public class MainDaySo {
    public static void main(String[] args) {
        String filename="src/IOFile/dayso.dat";
        int t=0;
        try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = "";
                line=br.readLine();
                String[] s = line.split("\\s+");
                for(String i:s) {
                    t+=Integer.parseInt(i);
                };
                br.close();
            } catch(FileNotFoundException e) {
                System.out.println(e);
            } catch(IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e) {
                System.out.println(e);
            }
        System.out.println("Tong: " + t);
        String fout="src/IOFile/outDS.txt";
        try {
            PrintWriter p=new PrintWriter(fout);
            p.print("Tong: " + t);
            p.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
