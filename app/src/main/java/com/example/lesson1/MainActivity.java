package com.example.lesson1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button equal, one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, devide, multiply, delete;
    private TextView info, info2, result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    public static String NAME_KEY = "name_key";

    MainAdapter adapter;
    static final int GENERATOR_REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupUIVieiws();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText() + "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                info.setText(info.getText() + "7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                info.setText(info.getText() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                compute();
                ACTION = ADDITION;
                info2.setText(String.valueOf(val1) + "+");
                info.setText(null);


            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                compute();
                ACTION = SUBTRACTION;
                info2.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                compute();
                ACTION = MULTIPLICATION;
                info2.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });


        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                compute();
                ACTION = DIVISION;
                info2.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU;
                result.setText(info2.getText().toString() + val2 + "=" + val1);
                info.setText(null);
                info2.setText(null);

                    Intent intent = new Intent(MainActivity.this, NextWindow.class);
                    intent.putExtra(NAME_KEY, result.getText().toString());
                    startActivity(intent);

                    if (ACTION == EQU) {
                        adapter.addText(result.getText().toString());
                    }


            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (info.getText().length() > 0) {

                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }

            }
        });

        RecyclerView recyclerView = findViewById(R.id.ma_recyclerview);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

    }

    public void addNewText (View v) {

        Intent intent = new Intent(MainActivity.this, GeneratorActivity.class);
        startActivityForResult(intent, GENERATOR_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GENERATOR_REQUEST_CODE)
            if (resultCode == RESULT_OK) {
                String text = data.getStringExtra(GeneratorActivity.NEW_TEXT_KEY);
                Log.d("ololo", text);
            }
    }

    private void setupUIVieiws() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        devide = findViewById(R.id.devide);

        info = findViewById(R.id.text_view1);
        info2 = findViewById(R.id.text_view2);
        result = findViewById(R.id.text_view3);
        equal = findViewById(R.id.equalizer);
        delete = findViewById(R.id.delete);


    }

    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION) {
                case ADDITION:

                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case EQU:
                    break;
            }
        } else {
            val1 = Double.parseDouble(info.getText().toString());
        }

    }

}


