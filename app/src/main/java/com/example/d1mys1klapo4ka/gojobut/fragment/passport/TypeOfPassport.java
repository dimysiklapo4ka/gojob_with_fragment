package com.example.d1mys1klapo4ka.gojobut.fragment.passport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.d1mys1klapo4ka.gojobut.R;

/**
 * Created by d1mys1klapo4ka on 04.07.2017.
 */

public class TypeOfPassport extends Fragment implements View.OnClickListener{

    private boolean TAG_BT_TWENTY = false;
    private boolean TAG_BT_SEWEN = false;
    private boolean TAG_BT_CHILD = false;

    private FragmentTransaction fragmentTransaction;
    private CoosePassportSteps mCoosePassportSteps;

    private Button mBtTwentyDay;
    private Button mBtSewenDay;
    private Button mBtChild;
    private View  view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.type_of_passport, null);

        view.findViewById(R.id.bt_twenty_ok).setOnClickListener(this);
        view.findViewById(R.id.bt_sewen_ok).setOnClickListener(this);
        view.findViewById(R.id.bt_child_ok).setOnClickListener(this);

        view.findViewById(R.id.biometric_twenty_day).setOnClickListener(this);
        view.findViewById(R.id.biometric_sewen_day).setOnClickListener(this);
        view.findViewById(R.id.child_twenty_day).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.biometric_twenty_day:
                view.findViewById(R.id.bt_twenty_ok).setVisibility(View.VISIBLE);
                    view.findViewById(R.id.bt_sewen_ok).setVisibility(View.GONE);
                    view.findViewById(R.id.bt_child_ok).setVisibility(View.GONE);

                break;
            case R.id.biometric_sewen_day:
                view.findViewById(R.id.bt_sewen_ok).setVisibility(View.VISIBLE);
                view.findViewById(R.id.bt_twenty_ok).setVisibility(View.GONE);
                view.findViewById(R.id.bt_child_ok).setVisibility(View.GONE);
                break;
            case R.id.child_twenty_day:
                view.findViewById(R.id.bt_child_ok).setVisibility(View.VISIBLE);
                view.findViewById(R.id.bt_sewen_ok).setVisibility(View.GONE);
                view.findViewById(R.id.bt_twenty_ok).setVisibility(View.GONE);
                break;
            case R.id.bt_twenty_ok:
                mCoosePassportSteps = new CoosePassportSteps();
                fragmentTransaction = getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, mCoosePassportSteps);
                fragmentTransaction.commit();
                break;
            case R.id.bt_sewen_ok:
                break;
            case R.id.bt_child_ok:
                break;
        }
    }

}
