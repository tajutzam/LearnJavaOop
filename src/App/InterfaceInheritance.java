/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public interface InterfaceInheritance {
    
    //didalam interface child bisa implement lebih dari 1 interface
    //dari interface ke interface bisa dilakukan pewarisan
    //interface ke interface menggunakan extends
    
    void hasBrand();
    String getBrand();
    
}
interface car extends InterfaceInheritance{
    void isCar();
    
}

class avanza implements InterfaceInheritance,car{

    @Override
    public void hasBrand() {
        System.out.println("brand");
    }

    @Override
    public String getBrand() {
       return "avanza";
    }
    public static void main(String[] args) {
        car car =new avanza();
        car.hasBrand();
        car.isCar();
        System.out.println(car.getBrand());
    }

    @Override
    public void isCar() {
        System.out.println("is Car");
    }
    
}
