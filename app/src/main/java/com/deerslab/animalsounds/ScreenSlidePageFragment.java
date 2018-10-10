package com.deerslab.animalsounds;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by keeper on 02.02.2016.
 */
public class ScreenSlidePageFragment extends Fragment{

    public static final String ARG_PAGE = "page";
    private int mPageNumber;
    private ImageView mImageView;
    private TextView mTextView;
    private static Database database;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        RelativeLayout rootView = (RelativeLayout) inflater.inflate(R.layout.page, container, false);

        mImageView = (ImageView) rootView.findViewById(R.id.animalPic);
        mTextView = (TextView) rootView.findViewById(R.id.animalName);

        return rootView;
        
    }

    public static ScreenSlidePageFragment create(Database database1, int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();

        database = database1;

        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final int resId = database.getPic(mPageNumber);
        mImageView.setImageResource(resId);
        mTextView.setText(database.getName(mPageNumber));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            mTextView.setAllCaps(true);
        }
    }
}
