package com.example.ttassignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gameEmulatorView;
    private Button scoreboardView;
    private Button selectPlayerOneView;
    private Button selectPlayerTwoView;
    private Button addPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameEmulatorView = (Button) findViewById(R.id.startGameBtn);
        scoreboardView = (Button) findViewById(R.id.viewScoreBoardBtn);
        selectPlayerOneView = (Button) findViewById(R.id.selectPlayerOneBtn);
        selectPlayerTwoView = (Button) findViewById(R.id.selectPlayerTwoBtn);
        addPlayerView = (Button) findViewById(R.id.addPlayerBtn);

        gameEmulatorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GameEmulatorActivity.class);
                startActivity(intent);
            }
        });

        scoreboardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScoreboardActivity.class);
                startActivity(intent);
            }
        });

        selectPlayerOneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectPlayerOneActivity.class);
                startActivity(intent);
            }
        });

        selectPlayerTwoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectPlayerTwoActivity.class);
                startActivity(intent);
            }
        });

        addPlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddPlayerActivity.class);
                startActivity(intent);
            }
        });


    }
}