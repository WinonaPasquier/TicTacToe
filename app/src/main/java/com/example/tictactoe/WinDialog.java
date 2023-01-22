package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.NonNls;

public class WinDialog extends Dialog {

    private final String message;
    private final MainActivityTikTacToe mainActivityTikTacToe;
    public WinDialog(@NonNls Context context,String message, MainActivityTikTacToe mainActivityTikTacToe){
        super(context);
        this.mainActivityTikTacToe = mainActivityTikTacToe;
        this.message=message;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.win_dialog_layout);

        final TextView messageTxt = findViewById(R.id.messageTxt);
        final Button startAgainBt = findViewById(R.id.startAgainBt);

        messageTxt.setText(message);

        startAgainBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainActivityTikTacToe.restartMatch();
                dismiss();
            }
        });

    }
}
