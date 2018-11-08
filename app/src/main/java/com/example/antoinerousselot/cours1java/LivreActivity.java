package com.example.antoinerousselot.cours1java;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LivreActivity extends ListActivity {
    List<Livre> maBibliotheque = new ArrayList<Livre>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.RemplirlaBibliotheque();
        ListView myListView= getListView();
        LivreAdapter adapter=new LivreAdapter(this, maBibliotheque);
        myListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void RemplirlaBibliotheque() {
        maBibliotheque.clear();
        for (int i=0;i<10000;i++){
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
        }


    }

}
