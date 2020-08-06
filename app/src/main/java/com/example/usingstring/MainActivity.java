package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textvMag2 = findViewById(R.id.textView2);

        textvMag2.setText(R.string.Msg2);

       Log.i("Lifecycle","Oncreate() invoked..");


    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","onstart() invoked..");
    }

    @Override
    protected void onRestart() {
            super.onRestart();
            Log.i("Lifecycle","onRestart() invoked..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","onRedume() invoked...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop() invoked...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoked...");
    }
}