package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibActivity extends AppCompatActivity {
    private TextView mResult;

    public String getResult(String v1, String v2, String a, String n, String p) {
        String result = p + " " + v1 + " from the " + a + " " + n + " and then will " + v2 + " with joy.";
        return result;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        mResult = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();
        String verb1 = intent.getStringExtra("verb1");
        String verb2 = intent.getStringExtra("verb2");
        String adjective = intent.getStringExtra("adjective");
        String noun = intent.getStringExtra("noun");
        String properNoun1 = intent.getStringExtra("properNoun1");
        mResult.setText(getResult(verb1, verb2, adjective, noun, properNoun1));




    }
}
