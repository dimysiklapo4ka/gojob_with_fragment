package com.example.d1mys1klapo4ka.gojobut.fragment.roles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.fragment.passport.PassportExecution;

/**
 * Created by d1mys1klapo4ka on 04.07.2017.
 */

public class CurrentStatus extends Fragment implements View.OnClickListener{

    private FragmentTransaction fragmentTransaction;
    private PassportExecution mPassportExecytion;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.current_status, null);

        view.findViewById(R.id.bt_i_dont_have_passport).setOnClickListener(this);
        view.findViewById(R.id.bt_I_do_not_have_work_visa).setOnClickListener(this);
        view.findViewById(R.id.bt_I_have_no_job).setOnClickListener(this);
        view.findViewById(R.id.bt_I_am_already_in_poland).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_i_dont_have_passport:

                mPassportExecytion = new PassportExecution();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, mPassportExecytion);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                break;
            case R.id.bt_I_do_not_have_work_visa:

                break;
            case R.id.bt_I_have_no_job:

                break;
            case R.id.bt_I_am_already_in_poland:

                break;
        }
    }
}
