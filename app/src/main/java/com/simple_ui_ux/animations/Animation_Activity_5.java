package com.simple_ui_ux.animations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.simple_ui_ux.R;

public class Animation_Activity_5 extends AppCompatActivity {


    RelativeLayout cardView;
    TextView fname,description;
    ImageView profileID ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation5);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cardView=findViewById(R.id.cardView);
        fname=findViewById(R.id.fname);
        description=findViewById(R.id.description);
        profileID=findViewById(R.id.profileID);

        //make sure to give same transitions names (elements that moves)in both xml elements and add windowActivityTransitions in theme style

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Animation_Activity_5.this, Animation_Activity_5_Second.class);

                Pair[] pairs= new Pair[3];
                pairs[0] = new Pair<View, String>(profileID,"profileTransition");
                pairs[1] = new Pair<View, String>(fname,"nameTransition");
                pairs[2] = new Pair<View, String>(description,"descTransition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Animation_Activity_5.this,pairs);

                startActivity(intent,options.toBundle());
            }
        });



    }
}