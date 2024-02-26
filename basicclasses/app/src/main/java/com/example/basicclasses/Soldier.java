package com.example.basicclasses;

import android.util.Log;

public class Soldier
{
    public int health;

    private int a = 5;
    private int b = 5;
    private int c = 5;

    Soldier(int a,int b, int c){
        this.a=a;this.b=b;c=c;
    }
    String soldierType;
    void shootEnemy(){
        //let's print which type of soldier is shooting
        Log.i(soldierType +"=", " is shooting");
    }
    public void setHealth(int x){ //setter
        if (x<5)
        {
        health = 7;
        }
    }

    public int getHealth(){  //getter

        return health;
    }

}
