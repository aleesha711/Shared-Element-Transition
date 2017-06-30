package com.example.venturedive.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

/**
 * Created by Aleesha Kanwal on 22/03/2017.
 */

public class FragmentB extends Fragment {
    Animation fadeIn,fadeOut;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmentb, container, false);

        tv=(TextView) rootView.findViewById(R.id.tv);
        fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        fadeIn.setDuration(1200);
        fadeIn.setFillAfter(true);

        fadeOut = new AlphaAnimation(1.0f , 0.0f);
        fadeOut.setDuration(1200);
        fadeOut.setFillAfter(true);
        tv.setText("This is an animated textview appearing here");
        tv.startAnimation(fadeIn);
        return rootView;
    }
}
