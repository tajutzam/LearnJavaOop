/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author user
 */
public interface DefaultMethodDiInterface {
    
    void isRun();
    int getTier();
    
    default boolean isBig(){
        return true;
    }

}
class Ex implements DefaultMethodDiInterface{

    @Override
    public void isRun() {
    }

    @Override
    public int getTier() {
        return 4;
    }
    
    public static void main(String[] args) {
        //saat membuat default method maka turunan tidak wajib overide
        
        DefaultMethodDiInterface df = new Ex();
        System.out.println(df.isBig());
    }
}
