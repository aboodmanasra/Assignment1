package com.example.assignment1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChallengesActivity extends AppCompatActivity {
    EditText challengeText;
    Button saveButton;
    Button loadButton;

    public static final String CHALLENGE_PREFS = "ChallengePrefs";
    public static final String KEY_CHALLENGE = "challengeKey";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        challengeText = findViewById(R.id.edtText);
        saveButton = findViewById(R.id.btnsave);
        loadButton = findViewById(R.id.loadbtn);

        sharedPreferences = getSharedPreferences(CHALLENGE_PREFS, Context.MODE_PRIVATE);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String challenge = challengeText.getText().toString().trim();

                if (!challenge.isEmpty()) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(KEY_CHALLENGE, challenge);
                    editor.apply();
                    Toast.makeText(ChallengesActivity.this, "Challenge saved!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ChallengesActivity.this, "Please enter a challenge", Toast.LENGTH_SHORT).show();
                }
            }
        });

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadChallenge();
            }
        });

        loadChallenge();
    }

    private void loadChallenge() {
        String savedChallenge = sharedPreferences.getString(KEY_CHALLENGE, "");
        challengeText.setText(savedChallenge);
    }
}

