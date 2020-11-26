package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    // yellow is 0 and red is 1 3 is empty
    int activePlayer =  0 ;

    int [] gameState = {2,2,2,2,2,2,2,2,2};

    int [][] winningPositions= {{0,1,2}, {0,3,6},{0,4,8},{3,4,5},{6,7,8},{1,4,7},{2,5,8},{2,4,6}};

    boolean activeGame = true;






    public void dropIn(View view){

        /*
        * set the value of the image without png image
        * */
        ImageView counter = (ImageView) view;
        /*
        * Now  set the position relative by Y
        * search in drawable folder to found yellow image and set
        * after that set animates like TranslationY by her original value 1500 and add rotation and setDuration
        * */

        /*
        * now instantiate the tag value from the ImageViews
        * */

        Log.i("tag", counter.getTag().toString());

        counter.setTranslationY(-1500);

        int tapCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tapCounter] == 2 && activeGame){
            gameState[tapCounter] = activePlayer;


            if (activePlayer == 0){
                counter.setImageResource(R.drawable.yellow);
                counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
                activePlayer = 0;
            }


            for (int[] winningPosition: winningPositions){

                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2){
                    activeGame = false;
                    String winner = "";

                    if (activePlayer == 1){
                        winner = "Yellow";
                    }else{
                        winner = "Red";
                    }


                    //Toast.makeText(this, winner +" ha ganado :v ", Toast.LENGTH_SHORT).show();

                    Button activateButton = (Button) findViewById(R.id.activateButton);
                    TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);
                    winnerTextView.setText(winner +" ha ganado :v ");
                    activateButton.setVisibility(view.VISIBLE);

                    winnerTextView.setVisibility(view.VISIBLE);
                }
            }
        }

    }

    public void activeGame (View view){

        Toast.makeText(this, "hola :v ", Toast.LENGTH_SHORT).show();
        Button activateButton = (Button) findViewById(R.id.activateButton);
        TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);

        activateButton.setVisibility(view.INVISIBLE);

        winnerTextView.setVisibility(view.INVISIBLE);

        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.gridLayout);

        for (int x = 0; x < gridLayout.getChildCount(); x++){

            ImageView counter = (ImageView) gridLayout.getChildAt(x);
            counter.setImageDrawable(null);

        }

        for (int x = 0; x < gameState.length; x++){
            gameState[x] = 2;
        }
        activePlayer =  0 ;

        activeGame = true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}