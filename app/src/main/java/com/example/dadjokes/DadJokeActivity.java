package com.example.dadjokes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class DadJokeActivity extends AppCompatActivity {
    private jokeMan jokeman = new jokeMan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_main);
    }

    public void onClickShowPunchLine(View view) {
        TextView jokes = (TextView) findViewById(R.id.punchLines);
        Spinner jokeChoice = (Spinner) findViewById(R.id.joke);
        String jokeSelected = String.valueOf(jokeChoice.getSelectedItem());
        List<String> jokesList = jokeman.getJokes(jokeSelected);
        StringBuilder jokesFormatted = new StringBuilder();
        for (String joke : jokesList) {
            jokesFormatted.append(joke).append('\n');
        }
        jokes.setText(jokesFormatted);
    }
}


