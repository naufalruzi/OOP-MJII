package com.example.changingvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numMessages = 0;
        numMessages=10;
        // Output the value of numMessages
        Log.i("numMessages = ", "" + numMessages);
        numMessages++;
        numMessages = numMessages + 1;
        Log.i("numMessages = ", "" + numMessages);
        // Now a boolean (just true or false)
        boolean isFriend = true;
        Log.i("isFriend = ", "" + isFriend);
        // A contact and an important message
        String contact = "James Gosling";
        String message = "Dear reader, I invented Java.";
        // Now let's play with those String variables
        Toast.makeText(this, "Message from" + contact,
                Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER,0,1);
        Toast.show();
        Toast.makeText(this, "Message is:" + message,
             Toast.LENGTH_SHORT).show();

    }
}