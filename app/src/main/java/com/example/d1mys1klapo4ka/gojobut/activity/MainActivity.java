package com.example.d1mys1klapo4ka.gojobut.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.d1mys1klapo4ka.gojobut.R;
import com.example.d1mys1klapo4ka.gojobut.fragment.login.LoginStart;
import com.example.d1mys1klapo4ka.gojobut.fragment.passport.CoosePassportSteps;
import com.example.d1mys1klapo4ka.gojobut.helper.HelperVisibilityButton;

public class MainActivity extends AppCompatActivity {

    private LoginStart loginStart;
    private FragmentTransaction fragmentTransaction;
    public static String  currentTag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelperVisibilityButton.goneButton(this);
        loginStart = new LoginStart();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, loginStart);
        fragmentTransaction.commit();
    }

}
