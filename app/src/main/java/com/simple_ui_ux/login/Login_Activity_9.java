package com.simple_ui_ux.login;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class Login_Activity_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login9);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


}