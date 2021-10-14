package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.simple_ui_ux.R;

public class Animation_Activity_8 extends AppCompatActivity {

    RelativeLayout ivSplash;
    TextView ivLogo,ivSubtitle,ivBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation8);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ivLogo=findViewById(R.id.ivLogo);
        ivSubtitle=findViewById(R.id.ivSubtitle);
        ivBtn=findViewById(R.id.ivBtn);
        ivSplash=findViewById(R.id.ivSplash);

        ivSplash.setAnimation(AnimationUtils.loadAnimation(this,R.anim.smalltobig));
        ivLogo.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fromlefttoright));
        ivSubtitle.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fromlefttoright));
        ivBtn.setAnimation(AnimationUtils.loadAnimation(this,R.anim.fromlefttoright));


        ivBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Animation_Activity_8.this, Animation_Activity_8_2.class);
                startActivity(intent);
            }
        });
    }
}