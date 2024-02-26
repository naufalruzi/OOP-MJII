package com.example.ml_polymorp;

import android.util.Log;
import android.widget.TextView;

public class Lapu_Lapu extends Hero{
    int btn = 0;
    double damage = 300;

    public void btnInput(int x){
        btn = x;
    }

    public void calculate(){
        this.damage = this.btn * this.damage;
    }

    public void displayOutput(){
        Log.i("info:","lapu-lapu damage :"+String.valueOf(this.damage));
    }
}
