package com.example.antoinerousselot.cours1java;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TestActivityIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent);
        final Button monBouton = (Button) findViewById(R.id.button1);
        monBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (arg0 == monBouton) {
                    this.call(4);
                }
            }

            private void call(int position) {
                Intent intent = null;
                switch (position) {
                    case 0: //ouvre une page web
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.fr"));
                        startActivity(intent);
                        break;
                    case 1: //lance un appel
                        intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0678353928"));
                        startActivity(intent);
                        break;
                    case 2: //lance un appel
                        intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0678353928"));
                        startActivity(intent);
                        break;
                    case 3: //Lance la carte
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.123,7.14347?z=19"));
                        startActivity(intent);
                        break;
                    case 4: //lance
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        startActivity(intent);
                        break;
                    case 5:
                        //Affiche la liste des contacts
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

