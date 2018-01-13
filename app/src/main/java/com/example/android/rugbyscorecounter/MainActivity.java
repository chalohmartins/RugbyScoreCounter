package com.example.android.rugbyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tryTeamA(View v) {
        teamA = teamA + 5;
        displayTeamAScores(teamA);
    }


    public void conversionTeamA(View v) {
        teamA = teamA + 2;
        displayTeamAScores(teamA);
    }


    public void penaltyTeamA(View v) {
        teamA = teamA + 3;
        displayTeamAScores(teamA);
    }


    public void dropGoalTeamA(View v) {
        teamA = teamA + 3;
        displayTeamAScores(teamA);
    }

    public void tryTeamB(View v) {
        teamB = teamB + 5;
        displayTeamBScores(teamB);
    }


    public void conversionTeamB(View v) {
        teamB = teamB + 2;
        displayTeamBScores(teamB);
    }


    public void penaltyTeamB(View v) {
        teamB = teamB + 3;
        displayTeamBScores(teamB);
    }


    public void dropGoalTeamB(View v) {
        teamB = teamB + 3;
        displayTeamBScores(teamB);
    }

    public void resetScore (View v){
        teamA = 0;
        teamB = 0;
        displayTeamAScores(teamA);
        displayTeamBScores(teamB);
    }

    public void displayTeamAScores (int scores){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scores));
    }

    public void displayTeamBScores (int scores){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scores));
    }
}
