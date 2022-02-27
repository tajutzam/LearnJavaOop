/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class Pholimorpisme {
    //banyak bentuk
    
    //adalah kemampuan sebuah object untuk berubah bentuk ke object yang lain
    //sangat erat dengan pewarisan
    String name;

    public Pholimorpisme(String name) {
        this.name = name;
    }
     public void doId(){
        System.out.println("Hello from Ph my name "+this.name);
    }
    
    
    
    
}
class Manager extends Pholimorpisme{

    public Manager(String name) {
        super(name);
    }
    public void doId(){
        System.out.println("Hello from Manager my name "+this.name);
        
    }

}
class VicePrecident extends Manager{

    public VicePrecident(String name) {
        super(name);
    }
     public void doId(){
        System.out.println("Hello from Vp my name "+this.name);
    }
       
}
class PholimorpismeApp{
    public static void main(String[] args) {
        Pholimorpisme ph = new Pholimorpisme("Eko");
        ph.doId();
        Pholimorpisme mn = new Manager("Mana");
        mn.doId();
        Manager vp = new VicePrecident("Vipi");
        vp.doId();
    }
}
