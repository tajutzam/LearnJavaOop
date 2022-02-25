/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class SuperCunstrotor {
    //super bisa mengakses cusntrotor juga
    //syarat mengakses didalam cusntroktor child
    //ketika membuat cunstructor di parent harus membuat cusntroktor di child
    String name;

    public SuperCunstrotor(String name) {
        this.name=name;
    }
    
    
}
class Manager extends SuperCunstrotor{
    //
    public Manager(String name) {
        super(name);
    }
    //boleh
    public Manager() {
        super(null);
    }

    void doId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
class ManagerApp{
    public static void main(String[] args) {
        SuperCunstrotor su = new SuperCunstrotor("test");
        System.out.println(su.name);
        Manager ma = new Manager("menggunakan parameter");
        System.out.println(ma.name);
        Manager man = new Manager();//parameter kosong
    }
}
