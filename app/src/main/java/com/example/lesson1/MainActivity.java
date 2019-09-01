package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero;

    TextView textViewOne, textViewTwo;

    Integer number1, number2;
    Integer sum, minus, devide, multiply;
    boolean addition, division, multiplication, subtraction;

    float ValueOne, ValueTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewOne = findViewById(R.id.text_view1);


        final Button equalizer = findViewById(R.id.equalizer);
        equalizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addition = true) {
                    textViewOne.setText(ValueOne + ValueTwo + "");
                    addition = false;
                }


            }
        });

        final Button one = findViewById(R.id.one);
        final Button two = findViewById(R.id.two);
        final Button three = findViewById(R.id.three);
        final Button four = findViewById(R.id.four);
        final Button five = findViewById(R.id.five);
        final Button six = findViewById(R.id.six);
        final Button seven = findViewById(R.id.seven);
        final Button eight = findViewById(R.id.eight);
        final Button nine = findViewById(R.id.nine);
        final Button zero = findViewById(R.id.zero);

        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiply = findViewById(R.id.multiply);
        final Button devide = findViewById(R.id.devide);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textViewOne.setText(textViewOne.getText() + "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "9");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "0");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textViewOne.setText(textViewOne.getText() + "+");

                if (textViewOne == null) {
                    textViewOne.setText(null);
                } else {
                    ValueOne = Float.parseFloat(textViewOne.getText() + "");

                    addition = true;
                    textViewOne.setText(null);
                }

            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer min = number1 - number2;
                textViewOne.setText(min);

                textViewOne.setText(textViewOne.getText() + "-");
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "*");
            }
        });


        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textViewOne.setText(textViewOne.getText() + "/");
            }
        });
    }
}

