/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class Inheritence {
    //pewarisan adalah kemampuan untuk menurunkan dari class ke child
    //semua field dan method yang ada pada parent bisa di akses di child
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
//contoh pewarisan
class child extends Inheritence{
    
    
}
class InheritanceApp{
    public static void main(String[] args) {
        child ch = new child();
        ch.setName("Vice Precident");
        System.out.println(ch.getName());
    }
}