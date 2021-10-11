package com.simple_ui_ux.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.eightbitlab.supportrenderscriptblur.SupportRenderScriptBlur;
import com.simple_ui_ux.R;

import eightbitlab.com.blurview.BlurView;

public class Login_Activity_11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login11);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}