package edu.washington.cathej.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public TextView deadPlayerDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Retrieve them from the content view

        deadPlayerDisplay = (TextView) findViewById(R.id.deadplayer);

        final TextView p1Display = (TextView) findViewById(R.id.player1score);
        final Button p1Plus = (Button) findViewById(R.id.player1plus);
        final Button p1Minus = (Button) findViewById(R.id.player1minus);
        final Button p1Plus5 = (Button) findViewById(R.id.player1plus5);
        final Button p1Minus5 = (Button) findViewById(R.id.player1minus5);

        final TextView p2Display = (TextView) findViewById(R.id.player2score);
        final Button p2Plus = (Button) findViewById(R.id.player2plus);
        final Button p2Minus = (Button) findViewById(R.id.player2minus);
        final Button p2Plus5 = (Button) findViewById(R.id.player2plus5);
        final Button p2Minus5 = (Button) findViewById(R.id.player2minus5);

        final TextView p3Display = (TextView) findViewById(R.id.player3score);
        final Button p3Plus = (Button) findViewById(R.id.player3plus);
        final Button p3Minus = (Button) findViewById(R.id.player3minus);
        final Button p3Plus5 = (Button) findViewById(R.id.player3plus5);
        final Button p3Minus5 = (Button) findViewById(R.id.player3minus5);

        final TextView p4Display = (TextView) findViewById(R.id.player4score);
        final Button p4Plus = (Button) findViewById(R.id.player4plus);
        final Button p4Minus = (Button) findViewById(R.id.player4minus);
        final Button p4Plus5 = (Button) findViewById(R.id.player4plus5);
        final Button p4Minus5 = (Button) findViewById(R.id.player4minus5);

        // Set Listeners for Player 1 buttons
        p1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p1Display.getText().toString()) + 1;
                adjustAndDisplayLife(lifeCount, p1Display, 1);
            }
        });

        p1Plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p1Display.getText().toString()) + 5;
                adjustAndDisplayLife(lifeCount, p1Display, 1);
            }
        });

        p1Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p1Display.getText().toString()) - 1;
                adjustAndDisplayLife(lifeCount, p1Display, 1);
            }
        });

        p1Minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p1Display.getText().toString()) - 5;
                adjustAndDisplayLife(lifeCount, p1Display, 1);
            }
        });


        // Set Listeners for Player 2 buttons
        p2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p2Display.getText().toString()) + 1;
                adjustAndDisplayLife(lifeCount, p2Display, 2);
            }
        });

        p2Plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p2Display.getText().toString()) + 5;
                adjustAndDisplayLife(lifeCount, p2Display, 2);
            }
        });

        p2Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p2Display.getText().toString()) - 1;
                adjustAndDisplayLife(lifeCount, p2Display, 2);
            }
        });

        p2Minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p2Display.getText().toString()) - 5;
                adjustAndDisplayLife(lifeCount, p2Display, 2);
            }
        });


        // Set Listeners for Player 3 buttons
        p3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p3Display.getText().toString()) + 1;
                adjustAndDisplayLife(lifeCount, p3Display, 3);
            }
        });

        p3Plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p3Display.getText().toString()) + 5;
                adjustAndDisplayLife(lifeCount, p3Display, 3);
            }
        });

        p3Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p3Display.getText().toString()) - 1;
                adjustAndDisplayLife(lifeCount, p3Display, 3);
            }
        });

        p3Minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p3Display.getText().toString()) - 5;
                adjustAndDisplayLife(lifeCount, p3Display, 3);
            }
        });


        // Set Listeners for Player 4 buttons
        p4Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p4Display.getText().toString()) + 1;
                adjustAndDisplayLife(lifeCount, p4Display, 4);
            }
        });

        p4Plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p4Display.getText().toString()) + 5;
                adjustAndDisplayLife(lifeCount, p4Display, 4);
            }
        });

        p4Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p4Display.getText().toString()) - 1;
                adjustAndDisplayLife(lifeCount, p4Display, 4);
            }
        });

        p4Minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lifeCount = Integer.parseInt(p4Display.getText().toString()) - 5;
                adjustAndDisplayLife(lifeCount, p4Display, 4);
            }
        });
    }

    public void adjustAndDisplayLife(int newLife, TextView display, int playerNumber) {
        if (newLife <= 0) {
            display.setText(0);
            deadPlayerDisplay.setText("Player " + playerNumber + "LOSES!");
        } else {
            display.setText(newLife);
        }
    }
}
