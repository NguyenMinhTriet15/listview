package com.example.listviewui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LaLiga extends AppCompatActivity {
    ListView lvlaliga;
    ArrayList<String> arrayCourse;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_liga);
        back = (Button) findViewById(R.id.btnback);
        lvlaliga = (ListView) findViewById(R.id.laliga);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Real Madrid");
        arrayCourse.add("Barcelona");
        arrayCourse.add("Real Betis");
        arrayCourse.add("Villarreal");
        arrayCourse.add("Athletic Bilbao");
        arrayCourse.add("Atletico Madrid");
        arrayCourse.add("Osasuna");
        arrayCourse.add("Girona");
        arrayCourse.add("Rayo Valadolid");
        arrayCourse.add("Celta");
        arrayCourse.add("Real Sociedad");
        arrayCourse.add("Valencia");
        arrayCourse.add("Mallorca");
        arrayCourse.add("Almeria");
        arrayCourse.add("Espanyol");
        arrayCourse.add("Sevilla");
        arrayCourse.add("Valladolid");
        arrayCourse.add("Getafe");
        arrayCourse.add("Elche");
        arrayCourse.add("Cadiz");
        ArrayAdapter adapter = new ArrayAdapter(LaLiga.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvlaliga.setAdapter(adapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showmain();
            }
        });
    }

    private void showmain() {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
