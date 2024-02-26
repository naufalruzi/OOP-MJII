package com.example.moneychanger;

import android.util.Log;
import android.widget.TextView;

public class PoundSterling extends MoneyChanger{
    int inputData = 0;
    double jumlah = 0;
    public void getInput(int x) {

        inputData = x;
    }
    public void calculate() {
        this.jumlah = this.inputData * (6);
    }
    public void displayOutput() {
        Log.i("info: ", "dalam PoundSterling " + String.valueOf(this.jumlah));
    }

}
