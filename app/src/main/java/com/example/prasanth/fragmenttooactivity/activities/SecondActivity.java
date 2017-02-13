package com.example.prasanth.fragmenttooactivity.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.prasanth.fragmenttooactivity.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, "Second Activity called", Toast.LENGTH_SHORT).show();
        if (bundle != null) {
            String string = bundle.getString("hello");
            Toast.makeText(this, "hello" + string, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "bundle not found", Toast.LENGTH_SHORT).show();
        }
    }
}
