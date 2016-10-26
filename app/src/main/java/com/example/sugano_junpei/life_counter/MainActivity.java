package com.example.sugano_junpei.life_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = (Button) findViewById(R.id.teamA);
        teamB = (Button) findViewById(R.id.teamB);
    }
}
