/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
class bankaccount{
    private String pemilikakun;
    private double saldo;
    //construktor
    public bankaccount(String pemilikakun, double saldoawal){
        this.pemilikakun=pemilikakun;
        this.saldo=saldoawal;
    }
    //getter untuk saldo(agar bisa dibaca tapi tidak diubah langsung)
    public double getsaldo(){
        return saldo;
    }
    //metode untuk menambah saldo
    public void deposit(double jumlah){
        if(jumlah>0){
            saldo +=jumlah;
            System.out.println("deposit berhasil! saldo sekarang:$ "+saldo);
            
        }else{
            System.out.println("jumlah deposit harus lebih dari 0!!");
        }
    }
    //metode untukmenarik saldo dengan validasi
    public void tariksaldo(double jumlah){
        if(jumlah>0 &&jumlah<=saldo){
            saldo -=jumlah;
            System.out.println("penarikan berhasil! saldo tersisa:$ "+saldo);
        }else{
            System.out.println("penarikan gagal! saldo tidak mencukupi atau jumlah tidak valid");
        }
    }

}
public class Private {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bankaccount akun1=new bankaccount("adi",1000);
        //mengakses saldo dengan metode getter
        System.out.println("saldo awal:$ "+akun1.getsaldo());
        //melakukan transaksi
        akun1.deposit(500);//menambahkan saldo
        akun1.tariksaldo(300);//menarik saldo
        //tidak bisa menarik saldo secara langsung
        akun1.saldo=1000;//error saldo bersifat perivate
        // TODO code application logic here
    }
}
