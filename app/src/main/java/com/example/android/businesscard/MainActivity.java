package com.example.android.businesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView credits = (TextView) findViewById(R.id.textview_credits);
        credits.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
