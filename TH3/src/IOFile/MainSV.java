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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GL75
 */
public class MainSV {
    public static void main(String[] args) {
        String filename="src/IOFile/sv.dat";
        List<SinhVien> list = new ArrayList<>();
        try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = "";
                 while((line=br.readLine()) != null) {
                    String[] s = line.split("\\,\\s*");
                    SinhVien sv = new SinhVien(Integer.parseInt(s[0]), s[1]);
                    list.add(sv);
                }
                br.close();
            } catch(FileNotFoundException e) {
                System.out.println(e);
            } catch(IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e) {
                System.out.println(e);
            }
        System.out.println("DS SV");
        for(SinhVien i:list) {
            System.out.println(i);
        }
    }
}
