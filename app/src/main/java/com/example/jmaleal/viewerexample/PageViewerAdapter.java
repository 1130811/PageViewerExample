package com.example.jmaleal.viewerexample;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by jmaleal on 12/03/2016.
 */
public class PageViewerAdapter extends PagerAdapter {

    View layout;
    Activity activity;
    private ArrayList<Integer> layout_ids;


    public PageViewerAdapter(Activity act, final int vec[]) {
        activity = act;
        layout_ids = new ArrayList<Integer>();
        for (int i = 0; i < vec.length; i++) {
            layout_ids.add(vec[i]);
        }
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {

        return arg0 == (( View ) arg1 );
    }

        @Override
        public Object instantiateItem (ViewGroup container,int position){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(layout_ids.get(position), null);
            ((ViewPager) container).addView(layout, 0);
            return layout;
        }
        @Override
        public void destroyItem (ViewGroup arg0,int arg1, Object arg2){
            (arg0).removeView((View) arg2);
        }

}