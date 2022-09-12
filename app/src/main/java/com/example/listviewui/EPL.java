package com.example.listviewui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EPL extends AppCompatActivity {
        ListView lvepl;
        ArrayList<String> arrayCourse;
        Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epl);
        back = (Button) findViewById(R.id.buttonback);
        lvepl = (ListView) findViewById(R.id.epl);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Arsenal");
        arrayCourse.add("Manchester City");
        arrayCourse.add("Tottenham");
        arrayCourse.add("Brighton");
        arrayCourse.add("Manchester United");
        arrayCourse.add("Chelsea");
        arrayCourse.add("Liverpool");
        arrayCourse.add("Brentford");
        arrayCourse.add("Leeds United");
        arrayCourse.add("Fulham");
        arrayCourse.add("Newcastle");
        arrayCourse.add("Southampton");
        arrayCourse.add("Bournemouth");
        arrayCourse.add("Wolves");
        arrayCourse.add("Crystal Palace");
        arrayCourse.add("Everton");
        arrayCourse.add("Aston Villa");
        arrayCourse.add("West Ham");
        arrayCourse.add("Nottingham Forrest");
        arrayCourse.add("Leicester City");
        ArrayAdapter adapter = new ArrayAdapter(EPL.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvepl.setAdapter(adapter);
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


