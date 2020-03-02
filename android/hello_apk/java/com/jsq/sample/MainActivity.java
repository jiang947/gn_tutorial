package com.jsq.sample;

import android.app.Activity;
import android.widget.TextView;

import android.os.Bundle;
// import androidx.appcompat.app.AppCompatActivity;
// import org.chromium.base.annotations.NativeMethods;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        // MainActivityJni().get().getStringFormJni();
    }

    


}