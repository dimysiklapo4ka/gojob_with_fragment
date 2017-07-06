package com.example.d1mys1klapo4ka.gojobut.fragment.registration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.fragment.login.LoginStart;

/**
 * Created by d1mys1klapo4ka on 03.07.2017.
 */

public class Registration extends Fragment implements View.OnClickListener{

    private FragmentTransaction fragmentTransaction;
    private LoginStart mLoginStart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.registration_fragment, null);
        view.findViewById(R.id.bt_registration).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_registration:
                mLoginStart = new LoginStart();
                fragmentTransaction = getFragmentManager().beginTransaction()
                .replace(R.id.container, mLoginStart)
                .addToBackStack(null);
                fragmentTransaction.commit();
        }

    }
}
