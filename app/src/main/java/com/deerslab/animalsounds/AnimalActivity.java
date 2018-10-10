package com.deerslab.animalsounds;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by keeper on 02.02.2016.
 */
public abstract class AnimalActivity extends FragmentActivity implements View.OnClickListener  {

    private static final int NUM_PAGES = 12;
    private static final int LOOP = 1000;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    private MediaPlayer mediaPlayer;
    private DelayedMediaPlayer delayedMediaPlayer;
    private Context context;

    protected Database database;

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_slide_activity);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setOnClickListener(this);

        ImageButton btnLeft = (ImageButton) findViewById(R.id.btnLeft);
        btnLeft.setOnClickListener(this);

        ImageButton btnRight = (ImageButton) findViewById(R.id.btnRight);
        btnRight.setOnClickListener(this);

        ImageButton btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        context = this;

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (delayedMediaPlayer != null) delayedMediaPlayer.cancel(true);
                if (mediaPlayer != null) mediaPlayer.release();

                try {
                    mediaPlayer = MediaPlayer.create(context, database.getSound(mPager.getCurrentItem()));
                    delayedMediaPlayer = new DelayedMediaPlayer(mediaPlayer);
                    delayedMediaPlayer.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });

        try {
            mediaPlayer = MediaPlayer.create(this, database.getSound(mPager.getCurrentItem()));
            delayedMediaPlayer = new DelayedMediaPlayer(mediaPlayer);
            delayedMediaPlayer.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnLeft:
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
                break;
            case R.id.btnRight:
                mPager.setCurrentItem(mPager.getCurrentItem()+1);
                break;
            case R.id.btnBack:
                if (mediaPlayer != null) mediaPlayer.release();
                if (delayedMediaPlayer != null) delayedMediaPlayer.cancel(true);
                startActivity(new Intent(AnimalActivity.this, MainMenuActivity.class));
                break;
            default:
                try {
                    mediaPlayer = MediaPlayer.create(context, database.getSound(mPager.getCurrentItem()));
                    mediaPlayer.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
        }
    }

    public void pageClick(View v) {
        try {
            mediaPlayer = MediaPlayer.create(context, database.getSound(mPager.getCurrentItem()));
            mediaPlayer.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ScreenSlidePageFragment.create(database, position);
        }

        @Override
        public int getCount() {
            return LOOP;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(AnimalActivity.this, MainMenuActivity.class));
        if (delayedMediaPlayer != null) delayedMediaPlayer.cancel(true);
        try {
            if (null != mediaPlayer) mediaPlayer.stop();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        finally {
            if (null != mediaPlayer) mediaPlayer.release();
        }
        this.finish();
    }
}
