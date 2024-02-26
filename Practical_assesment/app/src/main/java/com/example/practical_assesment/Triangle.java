package com.example.practical_assesment;

import android.util.Log;

public class Triangle extends SurfaceAreaShape {
    int inputData;
    int inputData2;
    double jumlah;
    @Override
    void getInput(int x, int y){
        inputData = x;
        inputData2 = y;
    }
    @Override
    void calculate(){
        jumlah=0.5*this.inputData*this.inputData2;
    }

    @Override
    void displayOutput(String x) {
        Log.i("info:",x + jumlah);

    }

    void welcomingMessage(){
        Log.i("info :","I am triangle");

    }
}
