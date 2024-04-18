package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button Lessonsbtn;
    private Button Quizzesbtn;
    private Button Challengesbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lessonsbtn = findViewById(R.id.Lessonsbtn);
        Quizzesbtn = findViewById(R.id.Quizzesbtn);
        Challengesbtn = findViewById(R.id.Challengesbtn);

      Lessonsbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, LessonsActivity.class);
              startActivity(intent);
          }
      });

      Quizzesbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this , QuizzesActivity.class);
              startActivity(intent);
          }
      });
      Challengesbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent (MainActivity.this , ChallengesActivity.class);
              startActivity(intent);
          }
      });

    }
}