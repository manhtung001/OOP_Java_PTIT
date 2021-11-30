/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author GL75
 */
public class SoDuongException extends Exception {
    public SoDuongException(String ms) {
        super(ms);
    }
}



//List<SinhVien> list = new ArrayList<SinhVien>();
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("src/file_handle/sv.dat"));
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                String[] temp = line.split(",");
//                list.add(new SinhVien(
//                        Integer.parseInt(temp[0]),
//                        temp[1],
//                        Double.parseDouble(temp[1]),
//                        temp[3]
//                ));
//            }
//            for (SinhVien s : list)
//                System.out.println(s);
//            br.close();
//        }
//        catch (FileNotFoundException e) {
//            System.err.println(e);
//        }
//        catch (IOException | NumberFormatException e) {
//            System.err.println(e);        
//        }