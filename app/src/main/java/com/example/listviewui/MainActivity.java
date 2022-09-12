package com.example.listviewui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvleagues;
    Button btnthem;
    EditText edtthem;
    Button btncapnhat;
    ArrayList<String> arrayCourse;
    Button btnremove;
    int vitri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvleagues = (ListView) findViewById(R.id.leagues);
        btnthem = (Button) findViewById(R.id.edit);
        edtthem = (EditText) findViewById(R.id.edtthem);
        btncapnhat = (Button) findViewById(R.id.update);
        btnremove = (Button) findViewById(R.id.btnxoa);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("England Premier League");
        arrayCourse.add("La Liga");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvleagues.setAdapter(adapter);
        lvleagues.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                showInfo();
                }
                if (i==1)
                {
                    showInfolaliga();
                }
                return false;
            }
        });
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String league = edtthem.getText().toString();
                arrayCourse.add(league);
                adapter.notifyDataSetChanged();
            }
        });
        lvleagues.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtthem.setText(arrayCourse.get(i));
                vitri = i;
            }
        });
        btncapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayCourse.set(vitri, edtthem.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        btnremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayCourse.remove(vitri);
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void showInfolaliga() {
        Intent it = new Intent(this, LaLiga.class);
        startActivity(it);
    }


    private void showInfo() {
        Intent it = new Intent(this, EPL.class);
        startActivity(it);
    }
}