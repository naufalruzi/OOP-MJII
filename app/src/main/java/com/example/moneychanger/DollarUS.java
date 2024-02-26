package com.example.moneychanger;

import android.util.Log;

public class DollarUS extends MoneyChanger{
    int inputData=0;
    double jumlah=0;
    public void getInput(int x) {

        inputData=x;
    }
    public void calculate() {
        this.jumlah=this.inputData*(4);
    }
    public void displayOutput() {
        Log.i("info: ", "dalam Dollar US  "+String.valueOf(this.jumlah));
    }

}
