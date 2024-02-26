package com.example.lib;

public class Kelas
{
    public static void main (String args[])
    {
        zaid obj1 = new zaid();//bina object
        zaid obj2 = new zaid();
        obj1.sifat();//baru print

        System.out.println("nilai x ialah :"+obj1.x);
        obj1.x=5;
        System.out.println("nilai x ialah :"+obj1.x);
        System.out.println("nilai x ialah :"+obj2.x);
    }
}

class zaid
{
    int x;

    public void sifat ()//method
    {
        System.out.println("Hai semua!!");

    }

}