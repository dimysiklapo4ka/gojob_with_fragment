package com.example.d1mys1klapo4ka.gojobut.fragment.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.fragment.registration.Registration;
import com.example.d1mys1klapo4ka.gojobut.fragment.roles.RolesEmployerOrWorker;

/**
 * Created by d1mys1klapo4ka on 03.07.2017.
 */

public class LoginStart extends Fragment implements View.OnClickListener {

    private FragmentTransaction fragmentTransaction;
    private Registration mRegistration;
    private RolesEmployerOrWorker mRolesEmployerOrWorker;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login_fragment,null);
        view.findViewById(R.id.tv_registration).setOnClickListener(this);
        view.findViewById(R.id.bt_ok_registration).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tv_registration:
                mRegistration = new Registration();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, mRegistration);
                fragmentTransaction.commit();

                break;

            case R.id.bt_ok_registration:
                mRolesEmployerOrWorker = new RolesEmployerOrWorker();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, mRolesEmployerOrWorker);
                fragmentTransaction.commit();

                break;
        }
    }
}
