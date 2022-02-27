/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class AbstrackClass {
    
    //abstrack class artinya class tersebut tidak bisa dibuat object secara langsung
    //harus diturunkan
    public static void main(String[] args) {
//        Kontrak kon = new Kontrak();salah

          Waris wr = new Waris();
          wr.setName("Zam");
          wr.sayHello();

    }
    
}
abstract class Kontrak{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    void sayHello(){
        System.out.println("Hello "+this.name);
    }
}
class Waris extends Kontrak{
    

    @Override
    void sayHello() {
        super.sayHello(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
