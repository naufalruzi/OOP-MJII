package com.example.real_world_method;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare and initialize a String and an int
        int anInt = 10;
        String aString = "I am a string";
        float afloat = 10.5F;
        // Now call the different versions of printStuff
        // The name stays the same, only the parameters vary
        printStuff(anInt);
        printStuff(aString);
        printStuff(anInt, aString);
        printStuff(afloat);
        printStuff(afloat,anInt,aString);

    }

    void printStuff(int myInt){
        Log.i("info", "This is the int only version");
        Log.i("info", "myInt = "+ myInt);
    }
    void printStuff(String myString){
        Log.i("info", "This is the String only version");
        Log.i("info", "myString = "+ myString);
    }
    void printStuff(int myInt, String myString){
        Log.i("info", "This is the combined int and String version");
        Log.i("info", "myInt = "+ myInt);
        Log.i("info", "myString = "+ myString);
    }
    void printStuff(float myFloat){
        Log.i("info", "This is the float only version");
        Log.i("info", "myFloat = "+ myFloat);
    }
    void printStuff(float myFloat,int myInt,String myString){
        //Log.i("info", "This is the float only version");
        Log.i("info", "myAll = "+ myFloat + myInt + myString);
    }
}