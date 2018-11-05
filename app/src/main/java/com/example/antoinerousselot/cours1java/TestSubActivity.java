package com.example.antoinerousselot.cours1java;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.antoinerousselot.cours1java.Service.BoundActivity;
import com.example.antoinerousselot.cours1java.Service.ServiceActivity;
import com.example.antoinerousselot.cours1java.receiver.BroadcastActivity;

public class TestSubActivity extends AppCompatActivity {
    int REQUEST_CODE=200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sub);
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(TestSubActivity.this,forResultActivity.class);
                i.putExtra("Value1", "This is value one for ActivityTwo");
                i.putExtra("Value2", "This is value two for ActivityTwo");

                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode==RESULT_OK && requestCode==REQUEST_CODE) {
            if (data.hasExtra("returnKey1")) {
                Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
            }
        }
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
