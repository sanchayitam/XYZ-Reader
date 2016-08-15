package com.example.xyzreader.ui;

/**
 * Created by sanch on 8/1/2016.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 *
 * ImageView that keeps aspect ratio when scaled.
 */
public class ScaleImageView extends ImageView {

    private static final String TAG = "ScaleImageView";

    public ScaleImageView(Context context) {
        super(context);
    }

    public ScaleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScaleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        Drawable drawable = getDrawable();
        if (drawable != null) {
            int mMaxWidth = getMeasuredWidth();

            int newSpecWidth = Math.min(MeasureSpec.getSize(widthMeasureSpec), mMaxWidth);
            setMeasuredDimension(newSpecWidth, newSpecWidth);

        }
    }
}

