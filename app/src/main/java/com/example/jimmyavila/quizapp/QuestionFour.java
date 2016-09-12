package com.example.jimmyavila.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jimmy on 9/7/2016.
 */
public class QuestionFour extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
    }

    public void answerWrong(View view) {
        //Toast message that comes up if user answers incorrect answer.
        Toast answerWrong = Toast.makeText(this, "Incorrect, try again", Toast.LENGTH_SHORT);
        answerWrong.show();
    }

    public void correctAnswer(View view) {
        //Toast message that comes up if the user chooses the correct answer
        Toast answerWrong = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT);
        answerWrong.show();

        /**
         * Additional information has been set to invisible until user
         * chooses the correct answer.  Text will be visible afterwards.
         */
        TextView additionalInfo = (TextView) findViewById(R.id.additional_info_question_four);
        additionalInfo.setVisibility(View.VISIBLE);
        //Button invisible until user chooses the correct answer.
        Button nextPageButton = (Button) findViewById(R.id.nextQuestion);
        nextPageButton.setVisibility(View.VISIBLE);
        //Button invisible until user chooses the correct answer.
        Button previousActivity = (Button) findViewById(R.id.previousPage);
        previousActivity.setVisibility(View.VISIBLE);
    }


    /**
     * @param view Goes to next question (question 3)
     */
    public void openNextQuestion(View view) {
        Intent goToQuestionFive = new Intent(this, QuestionFive.class);
        startActivity(goToQuestionFive);
        //Closes current activity
        this.finish();
    }

    public void submitAnswer(View view) {
        Intent intent = new Intent(this, QuestionFive.class);
        startActivity(intent);
        //Closes this activity
        this.finish();
    }
}
