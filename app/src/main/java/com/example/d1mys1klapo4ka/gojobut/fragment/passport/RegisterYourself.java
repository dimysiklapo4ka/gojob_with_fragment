package com.example.d1mys1klapo4ka.gojobut.fragment.passport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.gojobut.R;

/**
 * Created by d1mys1klapo4ka on 04.07.2017.
 */

public class RegisterYourself extends Fragment implements View.OnClickListener{

    private FragmentTransaction fragmentTransaction;
    private TypeOfPassport mTypeOfPassport;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.register_yourself_fragment, null);

        view.findViewById(R.id.bt_yourself_regiser).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_yourself_regiser:

                mTypeOfPassport = new TypeOfPassport();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, mTypeOfPassport);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                break;
        }
    }
}
