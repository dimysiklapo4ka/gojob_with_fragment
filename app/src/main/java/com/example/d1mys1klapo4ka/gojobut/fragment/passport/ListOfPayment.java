package com.example.d1mys1klapo4ka.gojobut.fragment.passport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.helper.HelperVisibilityButton;

/**
 * Created by d1mys1klapo4ka on 05.07.2017.
 */

public class ListOfPayment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_of_payments_fragment, null);
        HelperVisibilityButton.goneButton(getActivity());
        return view;
    }
}
