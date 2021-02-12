package com.example.stoichulator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Stoichulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stoichulator);

        Button btnCalculator = (Button) findViewById(R.id.Calculator);
        Button btnAtom = (Button) findViewById(R.id.Atom);
        Button btnNeutralization = (Button) findViewById(R.id.Neutralization);
        Button btnMolality = (Button) findViewById(R.id.Molality);
        Button btnMole = (Button) findViewById(R.id.Mole);
        Button btnMoleFraction = (Button) findViewById(R.id.MoleFraction);
        Button btnPercentYield = (Button) findViewById(R.id.Percent);


        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent periodictable = new Intent(Stoichulator.this, Calculator.class);
                startActivity(periodictable);
            }
        });
        btnAtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atom = new Intent(Stoichulator.this, AtomCalc.class);
                startActivity(atom);
            }
        });
        btnMolality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent molality = new Intent(Stoichulator.this, Molality.class);
                startActivity(molality);
            }
        });
        btnMole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mole= new Intent(Stoichulator.this, Mole.class);
                startActivity(mole);
            }
        });
        btnMoleFraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent molefraction = new Intent(Stoichulator.this, MoleFraction.class);
                startActivity(molefraction);
            }
        });
        btnNeutralization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neutralization = new Intent(Stoichulator.this, Neutralization.class);
                startActivity(neutralization);
            }
        });
        btnPercentYield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent percentyield = new Intent(Stoichulator.this, PercentYield.class);
                startActivity(percentyield);
            }
        });
        };
    }
