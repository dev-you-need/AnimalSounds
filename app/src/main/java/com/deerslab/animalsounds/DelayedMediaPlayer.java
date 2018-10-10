package com.deerslab.animalsounds;

import android.media.MediaPlayer;
import android.os.AsyncTask;

import java.util.concurrent.TimeUnit;

/**
 * Created by keeper on 02.02.2016.
 */
public class DelayedMediaPlayer extends AsyncTask<Void, Void, Void> {

    MediaPlayer mediaPlayer;

    public DelayedMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        if (null != mediaPlayer) mediaPlayer.start();
    }

    @Override
    protected void onCancelled() {
        try {
            if (null != mediaPlayer) mediaPlayer.stop();
        } catch (IllegalStateException e) {

        }
        finally {
            if (null != mediaPlayer) mediaPlayer.release();
        }
        super.onCancelled();
    }
}
