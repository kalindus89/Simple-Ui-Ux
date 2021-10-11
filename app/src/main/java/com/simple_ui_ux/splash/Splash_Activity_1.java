package com.simple_ui_ux.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.simple_ui_ux.R;

public class Splash_Activity_1 extends AppCompatActivity {

    ImageView logo,app_name,splashImg;
    LottieAnimationView lottieAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        splashImg=findViewById(R.id.splashImg);
        logo=findViewById(R.id.logo);
        app_name=findViewById(R.id.app_name);
        lottieAnim=findViewById(R.id.lottieAnim);

        splashImg.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        app_name.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnim.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
}