package com.example.d1mys1klapo4ka.gojobut.helper;

import android.app.Activity;
import android.view.View;

import com.example.d1mys1klapo4ka.gojobut.R;

/**
 * Created by d1mys1klapo4ka on 05.07.2017.
 */

public class HelperVisibilityButton {

    public static void goneButton(Activity activity){
        activity.findViewById(R.id.bt_print).setVisibility(View.GONE);
        activity.findViewById(R.id.bt_pdf).setVisibility(View.GONE);
    }
}
