package com.example.antoinerousselot.cours1java;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NetworkActivity extends AppCompatActivity {

    private final static String TAG = "NetworkActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        Thread background= new Thread(new Runnable() {
            @Override
            public void run() {
                loadFlux();
            }
        });
        background.start();

    }

    private void loadFlux(){
    }

}
