package com.deerslab.animalsounds;

/**
 * Created by keeper on 01.02.2016.
 */
public class DomesticDatabase implements Database {

    int amountPosition = 12;

    public int getName(int position){
        switch (position%amountPosition){
            case 0:
                return R.string.cat;
            case 1:
                return R.string.dog;
            case 2:
                return R.string.cow;
            case 3:
                return R.string.horse;
            case 4:
                return R.string.rooster;
            case 5:
                return R.string.chicken;
            case 6:
                return R.string.duck;
            case 7:
                return R.string.goose;
            case 8:
                return R.string.sheep;
            case 9:
                return R.string.donkey;
            case 10:
                return R.string.goat;
            default:
                return R.string.pig;
        }
    }

    public int getPic(int position){
        switch (position%amountPosition){
            case 0:
                return R.drawable.cat;
            case 1:
                return R.drawable.dog;
            case 2:
                return R.drawable.cow;
            case 3:
                return R.drawable.horse;
            case 4:
                return R.drawable.rooster;
            case 5:
                return R.drawable.chicken;
            case 6:
                return R.drawable.duck;
            case 7:
                return R.drawable.goose;
            case 8:
                return R.drawable.sheep;
            case 9:
                return R.drawable.donkey;
            case 10:
                return R.drawable.goat;
            default:
                return R.drawable.pig;
        }
    }

    public int getSound(int position){
        switch (position%amountPosition){
            case 0:
                return R.raw.cat;
            case 1:
                return R.raw.dog;
            case 2:
                return R.raw.cow;
            case 3:
                return R.raw.horse;
            case 4:
                return R.raw.rooster;
            case 5:
                return R.raw.chicken;
            case 6:
                return R.raw.duck;
            case 7:
                return R.raw.goose;
            case 8:
                return R.raw.sheep;
            case 9:
                return R.raw.donkey;
            case 10:
                return R.raw.goat;
            default:
                return R.raw.pig;
        }
    }


}
