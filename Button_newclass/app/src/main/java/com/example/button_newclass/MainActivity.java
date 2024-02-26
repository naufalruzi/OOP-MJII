package com.example.button_newclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dice dice1 = new Dice();
        dice1.roll();
        dice1.getNumber();
        Dice dice2 = new Dice();
        dice2.roll();
        dice2.getNumber();
        Dice dice3 = new Dice();
        dice3.roll();
        dice3.getNumber();
        Log.i("info :", "Result are " + dice1.getNumber() + dice2.getNumber() +
                dice3.getNumber() );


    }

//    public void topClick(View v){
//        Button button = new Button(this);
//        button.myMethod();
//    }
}