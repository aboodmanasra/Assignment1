package com.example.assignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuizzesActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private Button btn1, btn2, btn3, btn4 , btnBrowse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnBrowse = findViewById(R.id.btnBrowse);

        textViewQuestion.setText("Which artist painted ‘Cafe Terrace at Night’, ‘The Potato Eaters’ and ‘Irises’?");
        btn1.setText("Vincent van Gogh");
        btn2.setText("Leonardo da Vinci");
        btn3.setText("Pablo Picasso");
        btn4.setText("Salvador Dalí");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("Vincent van Gogh");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("Leonardo da Vinci");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("Pablo Picasso");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer("Salvador Dalí");
            }
        });
        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quizzesWebsite("https://www.britannica.com/quiz/browse/Visual-Arts");
            }
        });

    }

    private void checkAnswer(String selectedOption) {
        String correctAnswer = "Vincent van Gogh";
        if (selectedOption.equals(correctAnswer)) {
            // Correct answer
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            // Wrong answer
            Toast.makeText(this, "Wrong! The correct answer is " + correctAnswer, Toast.LENGTH_SHORT).show();
        }
    }



    private void quizzesWebsite(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
