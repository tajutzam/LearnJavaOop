/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class VariableHiding {
    //merupakan kesalahan jika kita membuat field di child dengan nama yang sama
    //field yang ada di parent
    
    //untuk mengatasi variable hiding cukup menggunakan super keyword
    public static void main(String[] args) {
        Child child = new Child();
        child.name="eko";
        child.doIt();
        
        Parent parent=child;
        parent.doIt();
        System.out.println(parent.name);
        
    }
    
    
}
class Parent{
    String name;
    
    void doIt(){
        System.out.println("Do it from parent"+name);
    }
    
}
class Child extends Parent{
    String name;
    @Override
    void doIt() { 
        System.out.println("do it from child");
    }
    
}
