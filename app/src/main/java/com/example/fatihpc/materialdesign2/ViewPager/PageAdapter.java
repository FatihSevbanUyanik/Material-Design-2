package com.example.fatihpc.materialdesign2.ViewPager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fatihpc.materialdesign2.R;

import java.util.ArrayList;

public class PageAdapter extends PagerAdapter {

    private ArrayList<PageData> pageData;
    private LayoutInflater layoutInflater;

    public PageAdapter(ArrayList<PageData> pageData, Context context) {
        layoutInflater = LayoutInflater.from( context );
        this.pageData = pageData;
    }

    @Override
    public int getCount() {
        return pageData.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate( R.layout.page_layout , container , false );
        TextView textView = view.findViewById( R.id.headingTextView );
        ImageView imageView = view.findViewById( R.id.imageView );
        textView.setText( pageData.get(position).getPageHeading() );
        imageView.setImageResource( pageData.get(position).getPageImageViewResID() );
        container.addView( view );
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView( (ConstraintLayout)object );
    }
}
