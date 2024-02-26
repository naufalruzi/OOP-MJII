package com.example.ml_polymorp;

import android.util.Log;

public class Layla extends Hero{
    int btn = 0;
    double damage = 500;

    public void btnInput(int x){
        btn = x;
    }

    public void calculate(){
        this.damage = this.btn * this.damage;
    }

    public void displayOutput(){
        Log.i("info:","layla damage :"+String.valueOf(this.damage));
    }
}
