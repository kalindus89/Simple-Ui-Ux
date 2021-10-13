package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.simple_ui_ux.R;

public class Animation_Activity_7 extends AppCompatActivity {

    TextView header;
    LottieAnimationView lottieAnim;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation7);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        header=findViewById(R.id.header);
        btn=findViewById(R.id.btn);
        lottieAnim=findViewById(R.id.lottieAnim);

        header.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animation2));
        btn.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animation1));

        lottieAnim.animate().translationX(2000).setDuration(2000).setStartDelay(3000);
        header.animate().translationY(-1400).setDuration(2700).setStartDelay(3000);
        btn.animate().translationY(1400).setDuration(2700).setStartDelay(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },5000);

    }
}