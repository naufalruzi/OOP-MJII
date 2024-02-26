package com.example.moneychanger;

import android.util.Log;

public class DollarNZ extends MoneyChanger{
    int inputData=0;
    double jumlah=0;
    public void getInput(int x) {

        inputData=x;
    }
    public void calculate() {
        this.jumlah=this.inputData*(3);
    }
    public void displayOutput() {
        Log.i("info: ", "dalam Dollar NewZeland "+String.valueOf(this.jumlah));
    }

}
