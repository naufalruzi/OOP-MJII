package com.example.override_inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition a = new Addition();
        Log.i("jawapan", String.valueOf(a.add(2,3)));
        Log.i("jawapan", String.valueOf(a.add(2,3,4)));
        Log.i("jawapan", String.valueOf(a.add(2,3.4)));

    }

    public class Addition {//overload
        public int add(int m, int n){

            return m + n;
        }
        public int add(int m, int n, int o){

            return m + n + o;
        }
        public int add(int m, double n){

            return m + (int)n;
        }
    }
}