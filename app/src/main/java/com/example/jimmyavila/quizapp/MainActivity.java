package com.example.jimmyavila.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param view Goes to next question (#2)
     */
    public void StartQuiz(View view) {
        //Tells the application that pressing this button connects to the
        //next Activity and assigns it new name.
        Intent goToFirstQuestion = new Intent(this, QuestionOne.class);
        //Opens the next activity
        startActivity(goToFirstQuestion);
        //Closes current activity
        this.finish();
    }

    public void ExitApplication(View view) {
        this.finish();
    }
}
