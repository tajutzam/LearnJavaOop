/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public class EqualsMethod {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    //dijava membandingkan object dengan equals
    public static void main(String[] args) {
        
        String first ="eko";
        first=first+"khanedy";
        
        System.out.println(first);
        String full="ekokhanedy";
        System.out.println(full);
        System.out.println(first.equals(full));//benar
        System.out.println(first==full);//salah
        
        
        
    }
    
    
    
}
