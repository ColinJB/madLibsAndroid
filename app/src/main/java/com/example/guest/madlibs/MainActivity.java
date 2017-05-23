package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mMadLib;
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mVerb1;
    private EditText mVerb2;
    private EditText mAdjective;
    private EditText mNoun;
    private EditText mProperNoun;


//
//    @Bind (R.id.titleTextView) TextView mTitleTextView;
//    @Bind (R.id.adjective) TextView mAdjective;
//    @Bind (R.id.verb1) TextView mVerb1;
//    @Bind (R.id.verb2) TextView mVerb2;
//    @Bind (R.id.noun) TextView mNoun;
//    @Bind (R.id.properNoun1) TextView mProperNoun1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMadLib = (Button) findViewById(R.id.madLib);
        mVerb1 = (EditText) findViewById(R.id.verb1);
        mVerb2 = (EditText) findViewById(R.id.verb2);
        mAdjective = (EditText) findViewById(R.id.adjective);
        mNoun = (EditText) findViewById(R.id.noun);
        mProperNoun = (EditText) findViewById(R.id.properNoun1);

        mMadLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verb1 = mVerb1.getText().toString();
                String verb2 = mVerb2.getText().toString();
                String adjective = mAdjective.getText().toString();
                String noun = mNoun.getText().toString();
                String properNoun = mVerb1.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                startActivity(intent);
            }
        });

    }
}
