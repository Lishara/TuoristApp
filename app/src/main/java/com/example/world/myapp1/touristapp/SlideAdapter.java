package com.example.world.myapp1.touristapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    //Image list
    public int[] lst_img = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };

    public String[] lst_title = {
            "Amstrong",
            "Satalite",
            "Black Hole",
            "Rocket"
    };

    //List of desc
    public String[] lst_desc = {
            "Neal Amstrong == Lishara",
            "Satalite == LS SAT",
            "Lishara went through this",
            "Rockert Pilot Lishara"
    };

    //BG colors
    public int[] bgcols = {
            Color.rgb(55, 55, 55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 89),
            Color.rgb(1, 188, 212)

    };

    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        RelativeLayout layoutslide = view.findViewById(R.id.slidlinearlayout);
        ImageView imageslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.texttitle);
        TextView description = (TextView) view.findViewById(R.id.textdescription);
        layoutslide.setBackgroundColor(bgcols[position]);
        imageslide.setImageResource(lst_img[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_desc[position]);
        container.addView(view);
        return view;
    }

    ;

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
