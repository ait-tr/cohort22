package ait.comparators;

import ait.model.Place;

import java.util.Comparator;

public class PlacesByRateComparator implements Comparator<Place>{
    @Override
    public int compare(Place o1, Place o2) {
        return Double.compare(o1.getRate(), o2.getRate());
    }

    @Override
    public Comparator<Place> reversed() {
        return Comparator.super.reversed();
    }
}
