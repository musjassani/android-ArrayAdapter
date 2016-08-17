package com.example.daffyduck.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView vue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //On récupère une ListView de notre layout en XML, c'est la vue qui représente la liste
        vue = (ListView) findViewById(R.id.listView);
        List<String> array = new ArrayList<String>();
        array.add("a");
        array.add("b");
        array.add("c");
        /*
       * Layout de chaque élément (là, il s'agit d'un layout par défaut
       * pour avoir deux textes l'un au-dessus de l'autre, c'est pourquoi on
       * n'affiche que le nom et le numéro d'une personne)
      */
        int id = android.R.layout.simple_list_item_1;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, id, array);
        vue.setAdapter(arrayAdapter);
    }
}
