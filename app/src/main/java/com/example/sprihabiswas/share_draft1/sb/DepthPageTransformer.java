package com.example.sprihabiswas.share_draft1.sb;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Spriha Biswas on 10/27/2015.
 */
public class DepthPageTransformer implements ViewPager.PageTransformer {
    //private static final float MIN_SCALE = 0.75f;
    private static final float MIN_SCALE = 0.90f;

    public void transformPage(View view, float position) {
        /**System.out.println(view.getWidth());
        System.out.println(view.getHeight());
        System.out.println(position);
        System.out.println(view.getX());
        System.out.println(view.getY());**/
       // int pageWidth = view.getWidth();

        int pageWidth = view.getHeight();


        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(0);

        } else if (position <= 0) { // [-1,0]
            // Use the default slide transition when moving to the left page
            view.setAlpha(1);
            view.setTranslationY(0);
            view.setScaleX(1);
            view.setScaleY(1);

        } else if (position <= 1) { // (0,1]
            // Fade the page out.
            //view.setAlpha(1 - position);

            // Counteract the default slide transition
            view.setTranslationY(pageWidth * -position);

            // Scale the page down (between MIN_SCALE and 1)
            float scaleFactor = MIN_SCALE
                    + (1 - MIN_SCALE) * (1 - Math.abs(position));
            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(0);
        }
    }
}
