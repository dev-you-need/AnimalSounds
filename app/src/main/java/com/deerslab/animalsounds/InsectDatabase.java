package com.deerslab.animalsounds;

/**
 * Created by keeper on 03.02.2016.
 */
public class InsectDatabase implements Database {

    int amountPosition = 12;

    public int getName(int position){
        switch (position%amountPosition){
            case 0:
                return R.string.mosquito;
            case 1:
                return R.string.bee;
            case 2:
                return R.string.dragonfly;
            case 3:
                return R.string.ant;
            case 4:
                return R.string.fly;
            case 5:
                return R.string.grasshopper;
            case 6:
                return R.string.wasp;
            case 7:
                return R.string.scarab;
            case 8:
                return R.string.bumblebee;
            case 9:
                return R.string.cricket;
            case 10:
                return R.string.locust;
            default:
                return R.string.chafer;
        }
    }

    @Override
    public int getPic(int position) {
        switch (position%amountPosition){
            case 0:
                return R.drawable.mosquito;
            case 1:
                return R.drawable.bee;
            case 2:
                return R.drawable.dragonfly;
            case 3:
                return R.drawable.ant;
            case 4:
                return R.drawable.fly;
            case 5:
                return R.drawable.grasshopper;
            case 6:
                return R.drawable.wasp;
            case 7:
                return R.drawable.scarab;
            case 8:
                return R.drawable.bumblebee;
            case 9:
                return R.drawable.cricket;
            case 10:
                return R.drawable.locust;
            default:
                return R.drawable.chafer;
        }
    }

    @Override
    public int getSound(int position) {
        switch (position%amountPosition){
            case 0:
                return R.raw.mosquito;
            case 1:
                return R.raw.bee;
            case 2:
                return R.raw.dragonfly;
            case 3:
                return R.raw.ant;
            case 4:
                return R.raw.fly;
            case 5:
                return R.raw.grasshopper;
            case 6:
                return R.raw.wasp;
            case 7:
                return R.raw.scarab;
            case 8:
                return R.raw.bumblebee;
            case 9:
                return R.raw.cricket;
            case 10:
                return R.raw.locust;
            default:
                return R.raw.chafer;
        }
    }
}
