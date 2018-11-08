package com.example.antoinerousselot.cours1java;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class TestActivitySimpleAdapterListView extends ListActivity {
    static final String TAG="SimpleAdapter";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Création de la ArrayList qui nous permettra d'alimenter la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> map;
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        map = new HashMap<String, String>();
        map.put("title", "R.Lukaku");
        map.put("description", "125 buts en 2 matchs");
        map.put("img", String.valueOf(R.drawable.lukaku));
        listItem.add(map);
        //et rebelote
        map = new HashMap<String, String>();
        map.put("title", "Dark Shaun");
        map.put("description", "10000 buts en 1 match");
        map.put("img", String.valueOf(R.drawable.wizard));
        listItem.add(map);
        map = new HashMap<String, String>();
        map.put("title", "Serge");
        map.put("description", "0 buts en 10000 match");
        map.put("img", String.valueOf(R.drawable.seb));
        listItem.add(map);

        SimpleAdapter classement = new SimpleAdapter(this.getBaseContext(),listItem,R.layout.layoutitem,
                new String[]{"img","title","description"},new int[]{R.id.imageView,R.id.title,R.id.description});

        setListAdapter(classement);
        Log.i(TAG,"Lancement activité simple adapter");

    }

}
