package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.titleTextView) TextView mTitleTextView;
    @Bind (R.id.adjective) EditText mAdjective;
    @Bind (R.id.verb1) EditText mVerb1;
    @Bind (R.id.verb2) EditText mVerb2;
    @Bind (R.id.noun) EditText mNoun;
    @Bind (R.id.properNoun1) EditText mProperNoun1;
    @Bind (R.id.madLib) Button mMadLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mMadLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verb1 = mVerb1.getText().toString();
                String verb2 = mVerb2.getText().toString();
                String adjective = mAdjective.getText().toString();
                String noun = mNoun.getText().toString();
                String properNoun1 = mProperNoun1.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                intent.putExtra("verb1", verb1);
                intent.putExtra("verb2", verb2);
                intent.putExtra("adjective", adjective);
                intent.putExtra("noun", noun);
                intent.putExtra("properNoun1", properNoun1);
                startActivity(intent);
            }
        });

    }
}
