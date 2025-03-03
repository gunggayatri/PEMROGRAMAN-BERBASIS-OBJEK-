/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
//interface
interface hewan{
void bersuara();//method abstrak
}
//implementasi pada kelas kucing
class kucing implements hewan{
@Override
public void bersuara(){
System.out.println("kucing mengeong : meow meow!");
}
}
// implementassi pasa kelas anjing
class anjing implements hewan{
@Override 
public void bersuara(){
System.out.println("anjing menggonggong : woof woof!");
}
}
//main class
public class interfacedemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hewan kucing = new kucing();
        hewan anjing = new anjing();
        
        kucing.bersuara();
        anjing.bersuara();
        // TODO code application logic here
    }
}
