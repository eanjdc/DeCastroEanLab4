package com.decastro.ean;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("logs", "onCreate has executed..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("logs", "onCreate has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("logs", "onCreate has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("logs", "onCreate has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("logs", "onCreate has executed..");
    }

    public void display(View v) {
        Toast.makeText(this, "Toast has executed.", Toast.LENGTH_LONG).show();
        Log.d("logs", "Toast has executed..");

    }

    public void display1(View v) {

        Snackbar.make(v, "Snackbar is displayed", Snackbar.LENGTH_LONG).show();
        Log.d("logs", "Snackbar has executed..");
    }

}
