package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class LessonsActivity extends AppCompatActivity {
Spinner spn;
Button btn;
ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        spn = findViewById(R.id.spn);
        btn = findViewById(R.id.btn);
        listView = findViewById(R.id.listView);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
Database db = new Database();
            String cat = spn.getSelectedItem().toString();
            List<LessonOptions> result = db.getLessonsOptions(cat);
            LessonOptions[] arr = result.toArray(new LessonOptions[result.size()]);
            ArrayAdapter<LessonOptions> adapter = new ArrayAdapter<LessonOptions>(LessonsActivity.this,
                    android.R.layout.simple_list_item_1, arr);
listView.setAdapter(adapter);

        }
    });

    }
}