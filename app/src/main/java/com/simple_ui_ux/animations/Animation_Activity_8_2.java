package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.simple_ui_ux.R;

public class Animation_Activity_8_2 extends AppCompatActivity {

    Button ivBtn,button,button2,button3,button5;
    ImageView imageView10;
    TextView textView14,textView15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation82);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ivBtn=findViewById(R.id.button6);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button5=findViewById(R.id.button5);
        button5=findViewById(R.id.button5);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);

        imageView10=findViewById(R.id.imageView10);


        ivBtn.setTranslationY(400);
        button.setTranslationY(400);
        button2.setTranslationY(400);
        button3.setTranslationY(400);
        button5.setTranslationY(400);

        ivBtn.setAlpha(0);
        button.setAlpha(0);
        button2.setAlpha(0);
        button3.setAlpha(0);
        button5.setAlpha(0);

        ivBtn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        button.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        button2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        button3.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        button5.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();


        imageView10.setAnimation(AnimationUtils.loadAnimation(this,R.anim.stb2));
        textView15.setAnimation(AnimationUtils.loadAnimation(this,R.anim.stb2));
        textView14.setAnimation(AnimationUtils.loadAnimation(this,R.anim.stb2));
    }
}