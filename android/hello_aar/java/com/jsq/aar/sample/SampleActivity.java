package com.jsq.aar.sample;

import android.app.Activity;
import android.widget.TextView;

import android.os.Bundle;

import com.jsq.aar.sample.R;

public class SampleActivity extends Activity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        TextView textView = findViewById(R.id.text_view);
        // TextView textView = new TextView(this);
        // textView.setText("hello ,I'm com.jsq.aar.sample.SampleActivity");
        // setContentView(textView);
    }

}