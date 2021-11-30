/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docGhiMaTran;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author GL75
 */
public class MainMaTran {
   public static void main(String[] args) {
        String filename="src/docGhiMaTran/matran.txt";
        int[][] matran = null;
        int hang = 0;
        int cot = 0;
        try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = "";
                line=br.readLine();
                
                String[] s = line.split("\\s+");
                hang = Integer.parseInt(s[0]);
                cot = Integer.parseInt(s[1]);
                
                matran = new int[hang][cot];
                line = "";
                int hangTmp = 0; 
                while((line=br.readLine()) != null) {
                    s = line.split("\\s+");
                    for (int i = 0; i < cot; i++) {
                        matran[hangTmp][i] = Integer.parseInt(s[i]);
                    }
                    hangTmp++;
                }
                br.close();
            } catch(FileNotFoundException e) {
                System.out.println(e);
            } catch(IOException e) {
                System.out.println(e);
            } catch(NumberFormatException e) {
                System.out.println(e);
            }
        
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
