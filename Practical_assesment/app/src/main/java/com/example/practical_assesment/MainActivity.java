package com.example.practical_assesment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editTextNumberDecimal);
        editText2 =findViewById(R.id.editTextNumberDecimal2);
    }
    public void rectangular (View v){
        Rectangular value = new Rectangular();
        String temp=editText.getText().toString();
        String temp2=editText2.getText().toString();
        int input = 0;
        int input2 = 0;
        if (!"".equals(temp)&&!"".equals(temp2)){
            input=Integer.parseInt(temp);
            input2=Integer.parseInt(temp2);
            value.getInput(input,input2);
            value.calculate();
            value.displayOutput("Area of rectangular is ");
            Toast.makeText(this, " my value is "+ value.jumlah,
                    Toast.LENGTH_SHORT).show();
            value.welcomingMessage();
        }

    }
    public void triangle (View v){
        Triangle value2 = new Triangle();
        String temp=editText.getText().toString();
        String temp2=editText2.getText().toString();
        int input = 0;
        int input2 = 0;
        if (!"".equals(temp)&&!"".equals(temp2)){
            input=Integer.parseInt(temp);
            input2=Integer.parseInt(temp2);
            value2.getInput(input,input2);
            value2.calculate();
            value2.displayOutput("Area of triangle is ");
            Toast.makeText(this, " my value is "+ value2.jumlah,
                    Toast.LENGTH_SHORT).show();
            value2.welcomingMessage();
        }

    }
}