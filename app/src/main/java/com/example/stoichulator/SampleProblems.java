package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleProblems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_problems);

        Button btnMolar = (Button) findViewById(R.id.Molar);
        Button btnPercent = (Button) findViewById(R.id.Percent);
        Button btnDilution = (Button) findViewById(R.id.Dilutions);
        Button btnNormal = (Button) findViewById(R.id.Normal);

        btnMolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problem_one = new Intent(SampleProblems.this, Problem.class);
                startActivity(problem_one);
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problem_two = new Intent(SampleProblems.this, Problem2.class);
                startActivity(problem_two);
            }
        });
        btnDilution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problem_three = new Intent(SampleProblems.this, Problem3.class);
                startActivity(problem_three);
            }
        });
        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problem_four = new Intent(SampleProblems.this, Problem4.class);
                startActivity(problem_four);
            }
        });
    }
}
