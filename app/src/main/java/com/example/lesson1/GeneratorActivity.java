package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GeneratorActivity extends AppCompatActivity {

    static final String NEW_TEXT_KEY = "new_text_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);

    }

    public void generate (View v) {

        Intent intent = new Intent();
        intent.putExtra(NEW_TEXT_KEY, "new_generated_text");
        setResult(RESULT_OK, intent);
        finish();
    }
}
