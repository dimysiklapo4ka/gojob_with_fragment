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

public class CoosePassportSteps extends Fragment implements View.OnClickListener{

    private FragmentTransaction fragmentTransaction;
    private ListOfDocument mListOfDocument;
    private ListOfPayment mListOfPayment;
    private FindNearestOvir mFindNearestOvir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.coose_passport_steps, null);

        view.findViewById(R.id.button).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
        view.findViewById(R.id.button3).setOnClickListener(this);
        view.findViewById(R.id.button4).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                mListOfDocument = new ListOfDocument();

                fragmentTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.container,mListOfDocument)
                        .addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.button2:
                mListOfPayment = new ListOfPayment();

                fragmentTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.container, mListOfPayment)
                        .addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.button3:
                mFindNearestOvir = new FindNearestOvir();

                fragmentTransaction = getFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container, mFindNearestOvir);
                fragmentTransaction.commit();
                break;
            case R.id.button4:
                break;


        }
    }
}
