package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ChooseAGame extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_agame);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startTTT = findViewById(R.id.startTTT);






        startTTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //changement d'activité
                Intent gameActivityIntent = new Intent(ChooseAGame.this, AddPlayers.class);
                startActivity(gameActivityIntent);
            }
        });


    }


}