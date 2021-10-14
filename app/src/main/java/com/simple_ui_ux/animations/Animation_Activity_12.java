package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.simple_ui_ux.MainActivityUi;
import com.simple_ui_ux.R;

public class Animation_Activity_12 extends AppCompatActivity {


    TextView ivLogo, ivSubtitle, ivBtn;
    RelativeLayout ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation12);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ivLogo = findViewById(R.id.ivLogo);
        ivSubtitle = findViewById(R.id.ivSubtitle);
        ivBtn = findViewById(R.id.ivBtn);
        ivSplash = findViewById(R.id.ivSplash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ivSplash.setVisibility(View.VISIBLE);
                ivSplash.setAnimation(AnimationUtils.loadAnimation(Animation_Activity_12.this,R.anim.bottom__to_top));

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ivLogo.setVisibility(View.VISIBLE);
                        ivLogo.setAnimation(AnimationUtils.loadAnimation(Animation_Activity_12.this,R.anim.fall_down));

                        ivSubtitle.setVisibility(View.VISIBLE);
                        ivSubtitle.setAnimation(AnimationUtils.loadAnimation(Animation_Activity_12.this,R.anim.fall_down));

                    }
                }, 700);


            }
        }, 300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(Animation_Activity_12.this, MainActivityUi.class));
                finish();

            }
        },6000);

    }
}