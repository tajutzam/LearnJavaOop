/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class MethodOveriding {
    private String name;
    
    
    //adalah kemampuan mendeklarasikan Ulang di child class
    //yang sudah ada di parent

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello "+this.name);
    }

}
class ChildMethodOveriding extends MethodOveriding{

   
    //ketika kita melakukan overiding di child maka method di parent
    //tidak bisa diakses kembali atau tertutupi dengan method child
    
    //overeading
     @Override
    public void sayHello() {
        System.out.println("Hello im child in "+getName()); 
    }

}
class ChildApp{
    public static void main(String[] args) {
       MethodOveriding mt = new MethodOveriding();
       mt.setName("Eko");
       mt.sayHello();
       
       ChildMethodOveriding child = new ChildMethodOveriding();
       child.setName("child");
       child.sayHello();
    }
}
