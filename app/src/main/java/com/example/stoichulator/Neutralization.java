package com.example.stoichulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Neutralization extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private TextView mTextViewResult;
    private Button mButtonAdd;
    private Button mButtonReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutralization);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mEditText3 = findViewById(R.id.edittext_number_3);
        mTextViewResult = findViewById(R.id.textview_result);
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
                int res = (num2*num3)/num1;
                mTextViewResult.setText(String.valueOf(res));
            }
        });
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText1.setText("");
                mEditText2.setText("");
                mEditText3.setText("");
                mTextViewResult.setText("0");
            }
        });
    }
}
