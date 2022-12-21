package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputID_1,inputID_2;
    TextView resultViewID;
    Button sumID, subID, mulID,divID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ID's
        inputID_1 = (EditText) findViewById(R.id.firstNum);
        inputID_2 = (EditText) findViewById(R.id.secondNum);
        sumID = (Button) findViewById(R.id.sumButton);
        subID = (Button) findViewById(R.id.subButton);
        mulID = (Button) findViewById(R.id.mulButton);
        divID = (Button) findViewById(R.id.divButton);
        resultViewID = (TextView) findViewById(R.id.result);

//        SUM
        sumID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(inputID_1.getText().toString());
                int num2 = Integer.parseInt(inputID_2.getText().toString());
                int result = num1+num2;
                resultViewID.setText(Integer.toString(result));

            }
        });

//        SUBTRACTION
        subID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(inputID_1.getText().toString());
                int num2 = Integer.parseInt(inputID_2.getText().toString());
                int result = num1-num2;
                resultViewID.setText(Integer.toString(result));
            }
        });

//        MULTIPLICATION
        mulID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(inputID_1.getText().toString());
                int num2 = Integer.parseInt(inputID_2.getText().toString());
                int result = num1*num2;
                resultViewID.setText(Integer.toString(result));
            }
        });

//        DIVISION
        divID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(inputID_1.getText().toString());
                float num2 = Float.parseFloat(inputID_2.getText().toString());
                float result = num1/num2;
                resultViewID.setText(Float.toString(result));
            }
        });

    }
}