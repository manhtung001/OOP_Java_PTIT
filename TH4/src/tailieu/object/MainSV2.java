/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import controller.IOFile;
import java.util.List;

/**
 *
 * @author GL75
 */
public class MainSV2 {
    public static void main(String[] args) {
        List<SinhVien> list=IOFile.doc("src/object/outSV.dat");
        for(SinhVien i:list)
            System.out.println(i);
    }
}
