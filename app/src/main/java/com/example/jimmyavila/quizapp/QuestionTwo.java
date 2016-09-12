package com.example.jimmyavila.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Jimmy on 9/7/2016.
 */
public class QuestionTwo extends AppCompatActivity implements View.OnClickListener {

final private String TAG = "QuestionTwo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        EditText userAnswer = (EditText) findViewById(R.id.user_answer_submit);
        String q2_userAnswer = userAnswer.getText().toString().trim().toLowerCase();
        userAnswer.setOnClickListener(this);
        Intent getData = new Intent();
    }

    public void submitAnswer(View view) {

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, FinalActivity.class);
        intent.putExtra("passedAnswer2", 0);
    }

    /**
     * @param view Goes to next question (question 3)
     */
    public void openNextQuestion(View view) {
        Intent intent = new Intent(this, QuestionThree.class);
        startActivity(intent);
        //Closes this activity
        this.finish();

    }
}
