package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Formula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);

        Button btnAtoms = (Button) findViewById(R.id.Atoms);
        Button btnAvogadro = (Button) findViewById(R.id.Avogadro);
        Button btnBleach = (Button) findViewById(R.id.Bleach);
        Button btnBond = (Button) findViewById(R.id.Bond);
        Button btnConcentration = (Button) findViewById(R.id.Concentration);
        Button btnDilution = (Button) findViewById(R.id.Dilution);

        btnAtoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Atoms = new Intent(Formula.this, Atoms.class);
                startActivity(Atoms);
            }
        });
        btnAvogadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Avogadro = new Intent(Formula.this, Avogadro.class);
                startActivity(Avogadro);
            }
        });
        btnBleach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bleach = new Intent(Formula.this, Bleach.class);
                startActivity(Bleach);
            }
        });
        btnBond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bond = new Intent(Formula.this, BondOrder.class);
                startActivity(Bond);
            }
        });
        btnConcentration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Concentration = new Intent(Formula.this, Concentration.class);
                startActivity(Concentration);
            }
        });
        btnDilution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dilution = new Intent(Formula.this, Dilution.class);
                startActivity(Dilution);
            }
        });
    }
}
