/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class bankaccount{
    private double saldo;
    public bankaccount(double saldoawal){
        this.saldo=saldoawal;
    }
    //getter
    public double getsaldo(){
        return saldo;
        
    }
    //setter dengan validasi
    public void setsaldo(double jumlah){
        if(jumlah>=0){
            this.saldo=jumlah;
        }else{
            System.out.println("saldo tidak bisa negatif!!");
        }
    }
}
public class penerapan_konsep_enkapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bankaccount bri=new bankaccount(200.0);
        //mengakses data melalui gettter
        System.out.println("saldo saat ini: "+bri.getsaldo());
        //mengubah data dengan setter
        bri.setsaldo(300.0);
        System.out.println("saldo saat ini: "+bri.getsaldo());
        //saldo negatif
        bri.setsaldo(-2.0);
        
        
        // TODO code application logic here
    }
}
