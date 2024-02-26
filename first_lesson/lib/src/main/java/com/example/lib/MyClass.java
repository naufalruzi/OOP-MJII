package com.example.lib;

public class MyClass
{
    public static void main (String args[])
    {
        kereta car1 = new kereta();//obj pertama
        kereta car2 = new kereta();//obj kedua
        kereta car3 = new kereta();//obj ketiga
        kereta car4 = new kereta();
        //kereta car1;
        //car1 = new kereta();
        car1.sifat();
        car2.warna="biru";
        car2.sifat(200);
    }


}

 class kereta// adalah class/blueprint/plan
{
    String warna = "merah";//variable
    int minimum_balance = 100 ;

    kereta()//constructor sbb nama sama dgn method
    {

    }
    public void sifat (int k)//method/function
    {
        System.out.println("Kereta saya warna :"+warna);
a = k;
    }
    public int sifatX (int k )//method/function
    {
        //System.out.println("Kereta saya warna :"+warna);
//        int g = 9;
//        return g;
           char a = 'k';
    }
}

class keihan //jgn letak () utk buat kelas
{
    //variable
    //method
    //contractor
    void lulu()
    {

    }//apa2 no int mesti ltk return
}