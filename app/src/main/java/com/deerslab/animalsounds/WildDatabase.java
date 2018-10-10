package com.deerslab.animalsounds;

/**
 * Created by keeper on 03.02.2016.
 */
public class WildDatabase implements Database {

    int amountPosition = 12;


    @Override
    public int getName(int position) {
        switch (position%amountPosition){
            case 0:
                return R.string.wolf;
            case 1:
                return R.string.fox;
            case 2:
                return R.string.hare;
            case 3:
                return R.string.hedgehog;
            case 4:
                return R.string.bear;
            case 5:
                return R.string.deer;
            case 6:
                return R.string.squirrel;
            case 7:
                return R.string.elk;
            case 8:
                return R.string.boar;
            case 9:
                return R.string.racoon;
            case 10:
                return R.string.badger;
            default:
                return R.string.beaver;
        }
    }

    @Override
    public int getPic(int position) {
        switch (position%amountPosition){
            case 0:
                return R.drawable.wolf;
            case 1:
                return R.drawable.fox;
            case 2:
                return R.drawable.hare;
            case 3:
                return R.drawable.hedgehog;
            case 4:
                return R.drawable.bear;
            case 5:
                return R.drawable.deer;
            case 6:
                return R.drawable.squirrel;
            case 7:
                return R.drawable.elk;
            case 8:
                return R.drawable.boar;
            case 9:
                return R.drawable.racoon;
            case 10:
                return R.drawable.badger;
            default:
                return R.drawable.beaver;
        }
    }

    @Override
    public int getSound(int position) {
        switch (position%amountPosition){
            case 0:
                return R.raw.wolf;
            case 1:
                return R.raw.fox;
            case 2:
                return R.raw.hare;
            case 3:
                return R.raw.hedgehog;
            case 4:
                return R.raw.bear;
            case 5:
                return R.raw.deer;
            case 6:
                return R.raw.squirrel;
            case 7:
                return R.raw.elk;
            case 8:
                return R.raw.boar;
            case 9:
                return R.raw.racoon;
            case 10:
                return R.raw.badger;
            default:
                return R.raw.beaver;
        }
    }
}
