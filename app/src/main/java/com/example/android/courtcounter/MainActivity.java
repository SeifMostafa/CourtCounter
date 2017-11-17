package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA,scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3points_to_teamA(View view) {
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    public void add2points_to_teamA(View view) {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    public void add1point_to_teamA(View view) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void add3points_to_teamB(View view) {
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }

    public void add2points_to_teamB(View view) {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }
    public void add1point_to_teamB(View view) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamB =0;
        scoreTeamA =0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

}
