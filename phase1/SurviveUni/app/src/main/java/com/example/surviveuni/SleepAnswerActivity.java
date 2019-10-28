package com.example.surviveuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class SleepAnswerActivity extends AppCompatActivity {
  public static final String EXTRA_MESSAGE = "com.example.surviveuni.MESSAGE";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sleep_answer);
  }

  public void submitAnswer(View view) {
    Intent intent = new Intent(this, SleepFeedbackActivity.class);
    EditText editText = (EditText) findViewById(R.id.answerText);
    String answer = editText.getText().toString();
    String feedBack = checkAnswer(answer);
    intent.putExtra(EXTRA_MESSAGE, feedBack);
    startActivity(intent);
  }

  private String checkAnswer(String answer) {
    int number = Integer.parseInt(answer);
    int correctAnswer = 5; // should be imported from previous activity
    if (number == correctAnswer) {
      return "Correct!";
      // update(stats);
    } else {
      return "Sorry!";
      // update(stats);
    }
  }
}