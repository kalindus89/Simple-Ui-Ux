package com.simple_ui_ux.full_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class FullUi_Activity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_ui4);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.intro_signIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.VISIBLE);
                findViewById(R.id.uiIntro).setVisibility(View.GONE);
                findViewById(R.id.uiSignIn).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.intro_signUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.VISIBLE);
                findViewById(R.id.uiIntro).setVisibility(View.GONE);
                findViewById(R.id.uiSignIn).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.signUpMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.GONE);
                findViewById(R.id.uiIntro).setVisibility(View.GONE);
                findViewById(R.id.uiSignIn).setVisibility(View.VISIBLE);
            }
        });
    }
}