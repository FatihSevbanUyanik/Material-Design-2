package com.example.fatihpc.materialdesign2.ViewPager;

import android.widget.ImageView;

import com.example.fatihpc.materialdesign2.R;

import java.util.ArrayList;

public class PageData  {

    private int pageImageViewResID;
    private String pageHeading;

    public PageData(int pageImageViewResID, String pageHeading) {
        this.pageImageViewResID = pageImageViewResID;
        this.pageHeading = pageHeading;
    }

    public int getPageImageViewResID() {
        return pageImageViewResID;
    }

    public void setPageImageViewResID(int pageImageViewResID) {
        this.pageImageViewResID = pageImageViewResID;
    }

    public String getPageHeading() {
        return pageHeading;
    }

    public void setPageHeading(String pageHeading) {
        this.pageHeading = pageHeading;
    }

    public static ArrayList<PageData> getData()
    {
        ArrayList<PageData> pageData = new ArrayList<>();

        int[] imageResIDs = {
                R.drawable.image1, R.drawable.image2, R.drawable.image3,
                R.drawable.image4, R.drawable.image5, R.drawable.image6 };

        String[] imageHeadings = {
                "Image 1" ,"Image 2" ,"Image 3" ,
                "Image 4" ,"Image 5" ,"Image 6" };

        for ( int i = 0 ; i < imageResIDs.length ; i++ )
            pageData.add( new PageData( imageResIDs[i] , imageHeadings[i] ) );

        return pageData;
    }

}
