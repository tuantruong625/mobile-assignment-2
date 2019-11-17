package com.example.ttassignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    String playerName;

    EditText playerNameInput;

    Button addPlayerNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        playerNameInput = (EditText) findViewById(R.id.addPlayerEditText);
        addPlayerNameButton = (Button) findViewById(R.id.addPlayerBtn);

        addPlayerNameButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addPlayerBtn:
                playerName = playerNameInput.getText().toString();
                showToast(playerName);
                break;
        }
    }

    private void showToast(String text) {
        Toast.makeText(AddPlayerActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
