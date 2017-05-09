package com.example.venturedive.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Aleesha Kanwal on 22/03/2017.
 */

public class FragmentA extends Fragment {

    ImageView image;
    MainActivity mActivity;
    Context mContext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmenta, container, false);

        image = (ImageView)rootView.findViewById(R.id.imagea);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              onImageClickEvent();
            }
        });
        return rootView;
    }

    private void onImageClickEvent(){

        mActivity = ((MainActivity) getActivity());
        mActivity.replaceFragment(new FragmentB(),"fragB",image);
    }


}
