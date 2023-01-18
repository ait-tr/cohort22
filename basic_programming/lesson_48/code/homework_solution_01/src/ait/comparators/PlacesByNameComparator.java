package ait.comparators;

import ait.model.Place;

import java.util.Comparator;

public class PlacesByNameComparator implements Comparator<Place> {
    @Override
    public int compare(Place o1, Place o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    @Override
    public Comparator<Place> reversed() {
        return Comparator.super.reversed();
    }
}
