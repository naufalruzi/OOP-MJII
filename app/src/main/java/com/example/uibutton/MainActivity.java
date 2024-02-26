package com.example.uibutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //  TextView textView = findViewById(R.id.textView);//global variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void topClick(View v) {
        TextView tv1 = (TextView) findViewById(R.id.editTextNumberDecimal);
        Naufal button = new Naufal(this);
        button.myMethod();
        tv1.setText("hai");
    }

    public void bottomClick(View v) {
        TextView textView = (TextView) findViewById(R.id.editTextNumberDecimal);
        Ruzinoor butang = new Ruzinoor(this);
        butang.myMethod(textView);


    }

    public void tekan(View v) {
        TextView textView = findViewById(R.id.editTextNumberDecimal);
        textView.setText("balik balik");
    }

    public void setup (View v){
        Bapak objbapak = new Bapak();
        String x = objbapak.method1();
        TextView textView = findViewById(R.id.editTextNumberDecimal);
        textView.setText(x);
    }
}