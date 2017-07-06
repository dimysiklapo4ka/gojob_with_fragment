package com.example.d1mys1klapo4ka.gojobut.fragment.roles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.helper.HelperVisibilityButton;

/**
 * Created by d1mys1klapo4ka on 03.07.2017.
 */

public class RolesEmployerOrWorker extends Fragment implements View.OnClickListener{

    private FragmentTransaction fragmentTransaction;
    private CurrentStatus mCurrentStatus;

    private Button btEmployer;
    private Button btWorker;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.roles_fragment, null);

        view.findViewById(R.id.bt_for_employer).setOnClickListener(this);
        view.findViewById(R.id.bt_for_worker).setOnClickListener(this);
        HelperVisibilityButton.goneButton(getActivity());


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_for_employer:

//                mCurrentStatus = new CurrentStatus();
//                fragmentTransaction = getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.container, mCurrentStatus);
//                fragmentTransaction.commit();

                break;

            case R.id.bt_for_worker:

                mCurrentStatus = new CurrentStatus();
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, mCurrentStatus);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                break;
        }
    }
}
