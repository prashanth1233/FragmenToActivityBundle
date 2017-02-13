package com.example.prasanth.fragmenttooactivity.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

import com.example.prasanth.fragmenttooactivity.R;
import com.example.prasanth.fragmenttooactivity.fragments.SendDataFragment;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        Toast.makeText(this, "calling fragment", Toast.LENGTH_SHORT).show();
        SendDataFragment sendDataFragment = new SendDataFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame1, sendDataFragment);
        fragmentTransaction.commit();
    }
}






