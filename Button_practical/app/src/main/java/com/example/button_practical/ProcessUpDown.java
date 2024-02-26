package com.example.button_practical;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class ProcessUpDown
{
//    private Context context;
//
//    public Button (Context context)
//    {
//        this.context = context;
//    }
    public void Tolak(){
      //  Toast.makeText(context, "Top button clicked",Toast.LENGTH_SHORT).show();
        for (int x =5;x>0; x--)
            Log.i("info","Count=" + x);
    }

    public void Tambah(){
        //  Toast.makeText(context, "Top button clicked",Toast.LENGTH_SHORT).show();
        for (int x =1;x<6; x++)
            Log.i("info","Count=" + x);
    }

}
