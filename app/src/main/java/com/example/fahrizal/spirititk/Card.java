package com.example.fahrizal.spirititk;

/**
 * Created by fahrizal on 10/20/16.
 */

public class Card
{
    private String mName;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Card(String name, int imageResourceId)
    {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getName()
    {
        return mName;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

}
