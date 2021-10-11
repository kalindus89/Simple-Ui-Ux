package com.simple_ui_ux.full_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class FullUi_Activity_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_ui8);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.intro_signIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.VISIBLE);
                findViewById(R.id.uiSignIn).setVisibility(View.GONE);
            }
        });

        findViewById(R.id.intro_signIn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.VISIBLE);
                findViewById(R.id.uiSignIn).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.intro_signUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.GONE);
                findViewById(R.id.uiSignIn).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.intro_signUp2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.uiSignup).setVisibility(View.GONE);
                findViewById(R.id.uiSignIn).setVisibility(View.VISIBLE);
            }
        });

    }
}