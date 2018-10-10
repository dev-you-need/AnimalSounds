package com.deerslab.animalsounds;

public class BirdsDatabase implements Database {

    int amountPosition = 12;

    public int getName(int position){
        switch (position%amountPosition){
            case 0:
                return R.string.pigeon;
            case 1:
                return R.string.crow;
            case 2:
                return R.string.sparrow;
            case 3:
                return R.string.titmouse;
            case 4:
                return R.string.bullfinch;
            case 5:
                return R.string.owl;
            case 6:
                return R.string.cuckoo;
            case 7:
                return R.string.gull;
            case 8:
                return R.string.woodpecker;
            case 9:
                return R.string.stork;
            case 10:
                return R.string.nightingale;
            default:
                return R.string.eagle;
        }
    }

    @Override
    public int getPic(int position) {
        switch (position%amountPosition){
            case 0:
                return R.drawable.pigeon;
            case 1:
                return R.drawable.crow;
            case 2:
                return R.drawable.sparrow;
            case 3:
                return R.drawable.titmouse;
            case 4:
                return R.drawable.bullfinch;
            case 5:
                return R.drawable.owl;
            case 6:
                return R.drawable.cuckoo;
            case 7:
                return R.drawable.gull;
            case 8:
                return R.drawable.woodpecker;
            case 9:
                return R.drawable.stork;
            case 10:
                return R.drawable.nightingale;
            default:
                return R.drawable.eagle;
        }
    }

    @Override
    public int getSound(int position) {
        switch (position%amountPosition){
            case 0:
                return R.raw.pigeon;
            case 1:
                return R.raw.crow;
            case 2:
                return R.raw.sparrow;
            case 3:
                return R.raw.titmouse;
            case 4:
                return R.raw.bullfinch;
            case 5:
                return R.raw.owl;
            case 6:
                return R.raw.cuckoo;
            case 7:
                return R.raw.gull;
            case 8:
                return R.raw.woodpecker;
            case 9:
                return R.raw.stork;
            case 10:
                return R.raw.nightingale;
            default:
                return R.raw.eagle;
        }
    }
}
