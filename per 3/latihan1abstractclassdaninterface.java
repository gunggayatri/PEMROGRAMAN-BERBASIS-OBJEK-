/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author gungg
 */
//abstrak class kendaraan
abstract class kendaraan{
String nama;
int jumlahroda;

public kendaraan(String nama, int jumlahroda){
this.nama=nama;
this.jumlahroda= jumlahroda;
}
// method abstrac yg harus diimplementasikan oleh sub class
abstract void bergerak();

public void info(){
System.out.println(nama+" memiliki"+jumlahroda+" roda");
}
}
// subclass mobil 
class mobil extends kendaraan{
    public mobil(String nama){
        super(nama,4);//mobil selalu punya 4 roda
}
@Override
void bergerak(){
System.out.println(nama+" bergerak dengan bensin");
}
}

//subclass sepeda motor
class sepedamotor extends kendaraan{
public sepedamotor (String nama){
    super(nama,2);//spdmtr punya 2 roda
}
@Override 
void bergerak(){
System.out.println(nama+" bergerak dengan mesin bensin");
}
}


//dengan interface 
interface kendaraanlistrik{
void isidaya();
}

//subclass mobil listrik 
class mobillistrik extends mobil implements kendaraanlistrik{
public mobillistrik(String nama){
super(nama);
}
@Override 
void bergerak(){
System.out.println(nama+" bergerak dengan motor listrik");
}
@Override
public void isidaya(){
System.out.println(nama+"sedang isi daya.");
}
}




//main class untuk menjalankan program

public class latihan1abstractclassdaninterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kendaraan mobil = new mobil("toyota");
        kendaraan motor = new sepedamotor("honda");
        mobillistrik tesla = new mobillistrik("tesla model 3");
        
        mobil.info();
        mobil.bergerak();
        
        motor.info();
        motor.bergerak();
        
        tesla.info();
        tesla.bergerak();
        tesla.isidaya();
        // TODO code application logic here
    }
}