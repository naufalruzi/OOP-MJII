package com.example.uibutton;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Ruzinoor extends Bapak {
    private Context context;

    public Ruzinoor (Context context)
    {
        this.context = context;
    }



    public void myMethod(TextView view){
        Toast.makeText(context, "bottom button clicked",Toast.LENGTH_SHORT).show();
 //       Log.i("info","The user clicked the top button");
        view.setText("hello");

    }

    public String method1(){

        return "lariiii";
    }
}
