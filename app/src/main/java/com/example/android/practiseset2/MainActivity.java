package com.example.android.practiseset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*intitializing score of team A to 0*/
    int scoreTeamA = 0;
    /*intitializing score of team b to 0*/
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Displayijng scores of team A and team B as 0*/
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /*Displays given score for team A*/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Displays given score for team B*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Resetting the values to 0 and displaying scoreboards of team A and team B as 0*/
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /*Displaying the score of team A after adding 2 to intial score*/
    public void twoptsA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /*Displaying the score of team A after adding 3 to intial score*/
    public void threeptsA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /*Displaying the score of team A after adding 6 to intial score*/
    public void sixptsA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    /*Displaying the score of team A after adding 7 to intial score*/
    public void sevenptsA(View view) {
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);
    }
    /*Displaying the score of team A after adding 8 to intial score*/
    public void eightptsA(View view) {
        scoreTeamA = scoreTeamA + 8;
        displayForTeamA(scoreTeamA);
    }
    /*Displaying the score of team B after adding 2 to intial score*/
    public void twoptsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /*Displaying the score of team B after adding 3 to intial score*/
    public void threeptsB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /*Displaying the score of team B after adding 6 to intial score*/
    public void sixptsB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    /*Displaying the score of team B after adding 7 to intial score*/
    public void sevenptsB(View view) {
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);
    }
    /*Displaying the score of team B after adding 8 to intial score*/
    public void eightptsB(View view) {
        scoreTeamB = scoreTeamB + 8;
        displayForTeamB(scoreTeamB);
    }

}
