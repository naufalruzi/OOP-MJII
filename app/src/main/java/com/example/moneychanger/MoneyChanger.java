package com.example.moneychanger;

import android.widget.TextView;

abstract class MoneyChanger {
    abstract void getInput(int x);
    abstract void calculate();
    abstract void displayOutput();

}
