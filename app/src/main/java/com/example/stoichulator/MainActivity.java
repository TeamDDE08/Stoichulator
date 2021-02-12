package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPeriodic = (Button) findViewById(R.id.Periodic);
        Button btnCalculator = (Button) findViewById(R.id.Calculator);
        Button btnStoichiometry = (Button) findViewById(R.id.Stoichiometry);
        Button btnProblem = (Button) findViewById(R.id.Problem);
        Button btnFormulas = (Button) findViewById(R.id.Formulas);
        Button btnElement = (Button) findViewById(R.id.Elements);
        Button btnExercises = (Button) findViewById(R.id.Exercises);

        btnPeriodic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent periodictable = new Intent(MainActivity.this, PeriodicTable.class);
                startActivity(periodictable);
            }
        });
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stoichulator = new Intent(MainActivity.this, Stoichulator.class);
                startActivity(stoichulator);
            }
        });
        btnStoichiometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stoichiometry = new Intent(MainActivity.this, Stoichiometry.class);
                startActivity(stoichiometry);
            }
        });
        btnProblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problem = new Intent(MainActivity.this, SampleProblems.class);
                startActivity(problem);
            }
        });
        btnFormulas.setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formulas = new Intent(MainActivity.this, Formula.class);
                startActivity(formulas);
            }
        });
        btnElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent element = new Intent(MainActivity.this, Element.class);
                startActivity(element);
            }
        });
        btnExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercises = new Intent(MainActivity.this, Exercises.class);
                startActivity(exercises);
            }
        });
    }
}
