package com.example.ml_polymorp;

import android.util.Log;

public class Eudora extends Hero{
    int btn = 0;
    double damage = 400;

    public void btnInput(int x){
        btn = x;
    }

    public void calculate(){
        this.damage = this.btn * this.damage;
    }

    public void displayOutput(){
        Log.i("info:","eudora damage :"+String.valueOf(this.damage));
    }
}
