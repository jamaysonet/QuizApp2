package com.example.jimmyavila.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by Jimmy on 9/7/2016.
 */
public class QuestionOne extends AppCompatActivity implements View.OnClickListener {
    /*
    *  // I want to increment/decrement this score if user chooses
    *  the correct/wrong answer and pass it to the next activity
    */
    //String correctAnswerQuestion1 = "correct";
    //String incorrectAnswerQuestion1 = "incorrect";
        int correctAnswer = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        RadioButton correctChoice = (RadioButton) findViewById(R.id.correct_answer_radio_button);
        if (correctChoice.isEnabled()) {
           correctAnswer++;
        } else {
            correctAnswer = 0;
        }

        correctChoice.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, FinalActivity.class);
        intent.putExtra("passedAnswer1", correctAnswer);
    }

    public void submitAnswer(View view) {
        Intent intent = new Intent(this, QuestionTwo.class);
        startActivity(intent);
        //Closes this activity
        this.finish();
    }
}

