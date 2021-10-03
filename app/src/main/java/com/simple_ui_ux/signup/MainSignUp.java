package com.simple_ui_ux.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.simple_ui_ux.R;

public class MainSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign_up);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewById(R.id.menu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainSignUp.this, SignUp_OneActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainSignUp.this, SignUp_twoActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainSignUp.this, SignUp_ThreeActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainSignUp.this, SignUp_FourActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.menu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainSignUp.this, SignUp_FiveActivity.class);
                startActivity(intent);
            }
        });
    }
}