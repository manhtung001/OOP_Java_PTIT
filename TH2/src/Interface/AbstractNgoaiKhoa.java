/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author GL75
 */
public abstract class AbstractNgoaiKhoa {
    private int id;
    private String name;
    
    //abstract methods
    public abstract void truocNhapHoc();
    public abstract void tuanDau();
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
