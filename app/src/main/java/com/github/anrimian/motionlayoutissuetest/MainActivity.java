package com.github.anrimian.motionlayoutissuetest;

import android.os.Bundle;
import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MotionLayout motionLayout = findViewById(R.id.motion_layout);
        motionLayout.setProgress(0.5f);

//        MotionLayoutUtils.setProgress(motionLayout, 0.5f);//<< this is solution
    }
}
