/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class SuperKeyword {
    //super digunakan ketika kita ingin mengakses atribut yang ada di parent
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
    public void doId(){
        
    }
    
}
class ChildSuper extends SuperKeyword{
    String name;

    @Override
    public void doId() {
        System.out.println("Hi Parent : "+super.getName());
      
    }
    
    
    
}
class ChildSuperApp{
    public static void main(String[] args) {
        SuperKeyword su = new SuperKeyword();
        su.setName("eko");
        SuperKeyword ch = new ChildSuper();
        ch.setName("oke");
        ch.doId();
    }
}
