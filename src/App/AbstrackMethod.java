/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public abstract class AbstrackMethod {
    //abstract method harus ada di class abstract juga
    //abstrack method tidak boleh memiliki block
    //abstract method harus di overide oleh class child nya
    abstract void run();
    
}
class ChildMethod extends AbstrackMethod{

    @Override
            //overide
    void run() {
        System.out.println("Child is run");
    }
    
    
}
class MethodApp{
    public static void main(String[] args) {
        AbstrackMethod met = new ChildMethod();
        met.run();
    }
}
