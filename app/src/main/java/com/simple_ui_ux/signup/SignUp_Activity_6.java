package com.simple_ui_ux.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class SignUp_Activity_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up6);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}