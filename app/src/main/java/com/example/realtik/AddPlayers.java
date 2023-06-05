package com.example.realtik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        final EditText player1 = findViewById(R.id.playerOneName);
        final EditText player2 = findViewById(R.id.playerTwoName);
        final Button startGame = findViewById(R.id.startGameBtn);


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayer1Name = player1.getText().toString();
                final String getPlayer2Name = player2.getText().toString();

                Intent intent = new Intent(AddPlayers.this,MainActivity.class);
                intent.putExtra("playerOne",getPlayer1Name);
                intent.putExtra("playerTwo",getPlayer2Name);
                startActivity(intent);


            }
        });
    }
}