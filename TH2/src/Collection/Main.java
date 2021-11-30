/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author GL75
 */

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();  // add moi loai deu duoc
        list.add("khong");
        list.add("manh");
        list.add("tung");
        list.add(true);
        list.add(12);
//        list.add(Object);
        list.get(0);
        list.remove("manh");
        list.remove(0);
        // => khi lay ra phair ep kieu: String a = (String)list.get(0)
        // cach loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
//        -------------------------------------------
        List<String> listStr = new ArrayList<String>(); // chi add dc string vao
        // => khi lay ra 0 phair ep kieu: String a = list.get(0)
        for(String i:listStr) { // dinh nghia cach tren thi k loop ntn duoc
            System.out.println(i);
        }
    }
}
