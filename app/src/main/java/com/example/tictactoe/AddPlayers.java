package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payers);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startGameBt = findViewById(R.id.startGameBt);

        startGameBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOneName = playerOne.getText().toString();
                final String getPlayerTwoName = playerTwo.getText().toString();

                if(getPlayerOneName.isEmpty()||getPlayerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this,R.string.warningNameGamers,Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(AddPlayers.this, MainActivityTikTacToe.class);
                    intent.putExtra("playerOne",getPlayerOneName);
                    intent.putExtra("playerTwo",getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });
    }
}