package com.deerslab.animalsounds;

/**
 * Created by keeper on 02.02.2016.
 */
public interface Database {

    int amountPosition = 12;

    public int getName(int position);
    public int getPic(int position);
    public int getSound(int position);
}
