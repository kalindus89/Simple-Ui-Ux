package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.scwang.wave.MultiWaveHeader;
import com.simple_ui_ux.R;

public class Animation_Activity_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation9);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MultiWaveHeader waveHeader = findViewById(R.id.waveHeader);
        MultiWaveHeader waveHeader2 = findViewById(R.id.waveHeader2);

        waveHeader.setStartColor(R.color.white);
        waveHeader.setCloseColor(Color.RED);
        waveHeader.setColorAlpha(.5f);

        waveHeader.setWaveHeight(50);
        waveHeader.setGradientAngle(360);
        waveHeader.setProgress(.8f);
        waveHeader.setVelocity(1f);
        waveHeader.setScaleY(1f);
       // waveHeader.setWaves("PairWave");
      //  waveHeader.start();
       // waveHeader.stop();
        waveHeader.isRunning();

        waveHeader2.setStartColor(R.color.light_blue_A400);
        waveHeader2.setCloseColor(R.color.gradient_end_color);
        waveHeader2.setColorAlpha(.5f);
        waveHeader2.setWaveHeight(50);
        waveHeader2.setGradientAngle(360);
        waveHeader2.setProgress(.8f);
        waveHeader2.setVelocity(1f);
        waveHeader2.setScaleY(-1f);
       // waveHeader2.setWaves("PairWave");
       // waveHeader2.start();
      //  waveHeader2.stop();
        waveHeader2.isRunning();
    }
}