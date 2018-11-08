package com.example.antoinerousselot.cours1java;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class LivreAdapter extends BaseAdapter {
    List<Livre> biblio;
    //Layout inflater aura pour mission de charger notre fichier xml
    LayoutInflater inflater;

    private class ViewHolder {
        TextView tvTitre;
        TextView tvAuteur;
    }
    public LivreAdapter (Context context, List<Livre> objects) {
        inflater = LayoutInflater.from(context);
        this.biblio = objects; }


    @Override
    public View getView(int position , View convertView, ViewGroup parent){
        ViewHolder holder;
        if (convertView==null){
            Log.v("test","convertView is Null");
            holder=new ViewHolder();
            convertView = inflater.inflate(R.layout.layoutitem,null);
            holder.tvTitre = (TextView) convertView.findViewById(R.id.title);
            holder.tvAuteur = (TextView) convertView.findViewById(R.id.auteur);
            convertView.setTag(holder);
        } else {
            Log.v("test", "convertView is not null");
            holder=(ViewHolder) convertView.getTag();
        }


        Livre livre = biblio.get(position);
        holder.tvTitre.setText(livre.getTitre());
        holder.tvAuteur.setText(livre.getAuteur());
        return convertView;
    }

    @Override
    public int getCount() { return biblio.size();
    }

    @Override
    public Livre getItem(int position) { return biblio.get(position);
    }
    @Override
    public long getItemId(int position) { return position;
    }


}
