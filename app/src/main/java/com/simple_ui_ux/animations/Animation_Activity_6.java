package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.simple_ui_ux.R;

public class Animation_Activity_6 extends AppCompatActivity {
    TextView header,name;
    LottieAnimationView lottieAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation6);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        header=findViewById(R.id.header);
        name=findViewById(R.id.name);
        lottieAnim=findViewById(R.id.lottieAnim);

        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.animation2);
        header.setAnimation(animation2);

        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.animation1);
        name.setAnimation(animation1);

    }
}