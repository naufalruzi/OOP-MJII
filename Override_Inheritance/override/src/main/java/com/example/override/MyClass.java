package com.example.override;

public class MyClass {
    public static void main(String[] args)
    {
        alif obj1 = new alif();
        alif obj2 = new alif();
        ba test1 = new ba();
        ba test2 = new ba();

        test1.barisatas();

        System.out.println(test1.x);

    }
}

class alif {
    int x=5;

    public void barisatas(){
        System.out.println("hoi");
    }
}

class ba extends alif {
    int x = 10;

    public void barisatas(){
        System.out.println("hoi");
    }

    public void barisbawah(){

    }
}