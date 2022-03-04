/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public interface InterfaceJava {
    //interface mirip dengan abstract namun method akan otomatis abstract
    
    void drive();
    int getTier();
    
}
class ChildInterface implements InterfaceJava{

    String name;
    int tier;
    public void drive() {
        System.out.println("Drive");
        
    }

    @Override
    public int getTier() {
        return 4;
    }
    
    
    
    public static void main(String[] args) {
        InterfaceJava car = new ChildInterface();
        car.drive();
        System.out.println(car.getTier());
        
    }
}
