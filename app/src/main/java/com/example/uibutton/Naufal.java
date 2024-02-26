package com.example.uibutton;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Naufal extends Ruzinoor{
    private Context context;

    public Naufal (Context context)
    {
        super(context);

        this.context = context;
    }
    public void myMethod(){
        Toast.makeText(context, "Top button clicked",Toast.LENGTH_SHORT).show();
//        Log.i("info","The user clicked the top button");

    }
}
