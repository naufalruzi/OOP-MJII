package com.example.button_newclass;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Button
{
    private Context context;

    public Button (Context context)
    {
        this.context = context;
    }
    public void myMethod(){
        Toast.makeText(context, "Top button clicked",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button");
    }
}
