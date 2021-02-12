package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AtomCalc extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private TextView mTextViewResult;
    private TextView mTextViewResult2;
    private TextView mTextViewResult3;
    private Button mButtonAdd;
    private Button mButtonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atom_calc);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mEditText3 = findViewById(R.id.edittext_number_3);
        mTextViewResult = findViewById(R.id.textview_result);
        mTextViewResult2 = findViewById(R.id.textview_result_2);
        mTextViewResult3 = findViewById(R.id.textview_result_3);
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
                if (mEditText3.getText().toString().length() == 0) {
                    mEditText3.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int num3 = Integer.parseInt(mEditText3.getText().toString());
                int p = num1;
                int n = num2 - num1;
                int e = num1 - num3;
                mTextViewResult.setText(String.valueOf(p));
                mTextViewResult2.setText(String.valueOf(n));
                mTextViewResult3.setText(String.valueOf(e));
            }
        });
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText1.setText("");
                mEditText2.setText("");
                mEditText3.setText("");
                mTextViewResult.setText("0");
                mTextViewResult2.setText("0");
                mTextViewResult3.setText("0");
            }
        });
    }
}
