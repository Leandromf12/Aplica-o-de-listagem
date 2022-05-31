package com.example.listagemdeitens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] hiphop;
    ArrayAdapter arrayAdapter;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hiphop = new String[]{
                "Kendrick Lamar", "Baco exu do blues", "Tupac", "Snop Dogg", "Dr. dre", "Eazy-e", "Travis scott",
                "Racionais'mcs", "Emicida", "Black Alien", "Major RD", "Borges", "Notorius B.I.G"
        };
        lista = findViewById(R.id.lista);
        arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.item_lista, R.id.textView, hiphop);
        lista.setAdapter(arrayAdapter);
    }
}