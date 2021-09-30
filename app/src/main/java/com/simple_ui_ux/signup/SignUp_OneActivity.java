package com.simple_ui_ux.signup;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.simple_ui_ux.R;

public class SignUp_OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_one);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}