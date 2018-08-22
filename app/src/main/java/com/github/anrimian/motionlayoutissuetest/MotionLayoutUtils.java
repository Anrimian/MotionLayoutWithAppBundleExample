package com.github.anrimian.motionlayoutissuetest;

import android.support.constraint.motion.MotionLayout;
import android.support.v4.view.ViewCompat;

public class MotionLayoutUtils {

    public static void setProgress(MotionLayout motionLayout, float progress) {
        if (ViewCompat.isLaidOut(motionLayout)) {
            motionLayout.setProgress(progress);
        } else {
            motionLayout.post(() -> motionLayout.setProgress(progress));
        }
    }
}
