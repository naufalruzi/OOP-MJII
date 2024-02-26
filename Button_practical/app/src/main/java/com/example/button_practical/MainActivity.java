package com.example.button_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ProcessUpDown processUpDown1 = new ProcessUpDown();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void countUp (View v){

        processUpDown1.Tambah();

    }
    public void countDown (View v){
  //      ProcessUpDown processUpDown2 = new ProcessUpDown();
        processUpDown1.Tolak();

    }
    public void linearLayout (View v){
        setContentView(R.layout.button_countup);

    }

    public void constraintLayout (View v){
        setContentView(R.layout.activity_main);

    }
}