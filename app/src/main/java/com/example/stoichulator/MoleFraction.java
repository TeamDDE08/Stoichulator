package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MoleFraction extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private TextView mTextViewNum;
    private Button mButtonAdd;
    private Button mButtonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mole_fraction);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mTextViewNum = findViewById(R.id.textview_num3);
        mButtonAdd = findViewById(R.id.button_add);
        mButtonReset = findViewById(R.id.button_reset);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                double num1 = Integer.parseInt(mEditText1.getText().toString());
                double num2 = Integer.parseInt(mEditText2.getText().toString());
                double num3 = num1 + num2;
                double res = num1/num3;
                mTextViewNum.setText(String.valueOf(num3));
                mTextViewResult.setText(String.valueOf(res));
            }
        });
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText1.setText("");
                mEditText2.setText("");
                mTextViewNum.setText("");
                mTextViewResult.setText("0");
            }
        });
    }
}
