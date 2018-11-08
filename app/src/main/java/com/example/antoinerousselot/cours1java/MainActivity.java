package com.example.antoinerousselot.cours1java;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.antoinerousselot.cours1java.Service.BoundActivity;
import com.example.antoinerousselot.cours1java.Service.ServiceActivity;
import com.example.antoinerousselot.cours1java.receiver.BroadcastActivity;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //This is to trigger an action after a click on the button
                Intent monIntent= new Intent(MainActivity.this,LivreActivity.class);
                startActivity(monIntent);
            }
        });
    }
    static final String Tag="Centrale";



    protected void onStart(){
        Log.d(Tag,"onStart");
        super.onStart();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }
}
