package com.chenxi.geoquiz;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private Button mTrueBtn;
    private Button mFalseBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //mTrueBtn = (Button) findViewById(R.id.true_button);
        mFalseBtn = (Button) findViewById(R.id.false_button);

        mTrueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ShowToast(R.string.correct_toast);
            }
        });

        mFalseBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ShowToast(R.string.incorrect_toast);

            }
        });

    }

    private void ShowToast(int resId) {
        Toast.makeText(QuizActivity.this, resId, Toast.LENGTH_LONG).show();
    }
}
