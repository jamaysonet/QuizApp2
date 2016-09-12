package com.example.jimmyavila.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Jimmy on 9/7/2016.
 */
public class FinalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void openMainPage(View view) {
        //When the "Main page" button is pressed the user will be taken
        //back.
        Intent goToMainActivity = new Intent(this, MainActivity.class);
        startActivity(goToMainActivity);
    }

    public void exitApplication(View view) {
        this.finish();
    }

    public void viewResults(View view) {
        Intent intent = getIntent();
        int correctAnswerQuestion1 = (int) intent.getIntExtra("passedAnswer", 0);
        Toast answerRight = Toast.makeText(this, "You have " + correctAnswerQuestion1 + " correct", Toast.LENGTH_SHORT);
        answerRight.show();

    }

    public void ViewResults(View view) {
    }
}