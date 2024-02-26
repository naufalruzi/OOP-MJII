package com.example.moneychanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.uibutton.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPound(View v) {
        PoundSterling poundSterling = new PoundSterling();

        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String temp = editText.getText().toString();
        int value = 0;
        if (!"".equals(temp)) {
            value = Integer.parseInt(temp);
            poundSterling.getInput(value);
            poundSterling.calculate();
            poundSterling.displayOutput();
           //textView.setText();
        }

    }

    public void buttonDollarUS(View v) {
        DollarUS dollarUS = new DollarUS();

        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String temp = editText.getText().toString();
        int value = 0;
        if (!"".equals(temp)) {
            value = Integer.parseInt(temp);
            dollarUS.getInput(value);
            dollarUS.calculate();
            dollarUS.displayOutput();
        }
    }

    public void buttonDollarNZ(View v) {
        DollarNZ dollarNZ = new DollarNZ();

        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String temp = editText.getText().toString();
        int value = 0;
        if (!"".equals(temp)) {
            value = Integer.parseInt(temp);
            dollarNZ.getInput(value);
            dollarNZ.calculate();
            dollarNZ.displayOutput();
        }

    }
}