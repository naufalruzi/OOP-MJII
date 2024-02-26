package com.example.ml_polymorp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText =findViewById(R.id.editTextNumberDecimal);
    }
    public void buttonLapu (View v){
        Lapu_Lapu atk1 = new Lapu_Lapu();
        String temp=editText.getText().toString();
        int input = 0;
        if (!"".equals(temp)){
            input=Integer.parseInt(temp);
            atk1.btnInput(input);
            atk1.calculate();
            atk1.displayOutput();

        }
        textView.setText(String.valueOf(atk1.damage));

    }
    public void buttonLayla (View v){
        Layla atk2 = new Layla();
//        TextView textView = findViewById(R.id.textView);
//        EditText editText =findViewById(R.id.editTextNumberDecimal);
        String temp=editText.getText().toString();
        int input = 0;
        if (!"".equals(temp)){
            input=Integer.parseInt(temp);
            atk2.btnInput(input);
            atk2.calculate();
            atk2.displayOutput();

        }
        textView.setText(String.valueOf(atk2.damage));

    }
    public void buttonEudora (View v){
        Eudora atk3 = new Eudora();
//        TextView textView = findViewById(R.id.textView);
//        EditText editText =findViewById(R.id.editTextNumberDecimal);
        String temp=editText.getText().toString();
        int input = 0;
        if (!"".equals(temp)){
            input=Integer.parseInt(temp);
            atk3.btnInput(input);
            atk3.calculate();
            atk3.displayOutput();

        }
        textView.setText(String.valueOf(atk3.damage));

    }
}