package com.example.prasanth.fragmenttooactivity.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.prasanth.fragmenttooactivity.R;
import com.example.prasanth.fragmenttooactivity.activities.SecondActivity;


public class SendDataFragment extends android.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_send_data, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = new Bundle();
        bundle.putString("hello", "msg");
       Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtras(bundle);
    }
}
