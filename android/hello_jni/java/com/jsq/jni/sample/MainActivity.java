package com.jsq.jni.sample;

import android.app.Activity;
import android.widget.TextView;

import android.os.Bundle;
// import androidx.appcompat.app.AppCompatActivity;
// import org.chromium.base.annotations.NativeMethods;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        
        TextView textView = new TextView(this);
        textView.setText(Hello.getString());
        setContentView(textView);


    }


}