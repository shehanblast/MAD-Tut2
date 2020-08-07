package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.tvMsg2);
        txtMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle","OnCreate called");



    }

    public void onStart() {

        super.onStart();
        Log.i("Lifecycle","Onstart created");
    }

    @Override
    public void onResume() {

        super.onResume();
        Log.i("Lifecycle", "OnResume created");
    }

    @Override
    public void onPause() {

        super.onPause();
        Log.i("Lifecycle", "OnPause created");
    }

    @Override
    public void onStop() {

        super.onStop();
        Log.i("Lifecycle", "OnStop created");
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        Log.i("Lifecycle", "OnDestroy created");
    }

    @Override
    public void onRestart() {

        super.onRestart();
        Log.i("Lifecycle", "OnRestart created");
    }
}
