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

public class ListOfDocument extends Fragment implements View.OnClickListener {

    private FragmentTransaction fragmentTransaction;
    private SampleReceist mSampleReceist;
    private MilitaryRegistration mMilitaryRegistration;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list_of_document_fragment, null);

        view.findViewById(R.id.bt_sample_receipt).setOnClickListener(this);
        view.findViewById(R.id.bt_military_registration).setOnClickListener(this);
        view.findViewById(R.id.bt_ok_list_doc).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bt_sample_receipt:
                mSampleReceist = new SampleReceist();

                fragmentTransaction = getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, mSampleReceist);
                fragmentTransaction.commit();
                break;

            case R.id.bt_military_registration:
                mMilitaryRegistration = new MilitaryRegistration();

                fragmentTransaction = getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, mMilitaryRegistration);
                fragmentTransaction.commit();
                break;

            case R.id.bt_ok_list_doc:
                break;
        }
    }
}
