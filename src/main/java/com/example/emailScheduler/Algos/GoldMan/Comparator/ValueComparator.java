package com.example.emailScheduler.Algos.GoldMan.Comparator;

import java.util.Comparator;

public class ValueComparator implements Comparator<NumClass> {

    @Override
    public int compare(NumClass o1, NumClass o2) {
        if(o1.getAnInt()==o2.getAnInt())
            return Integer.parseInt(""+o1.getAnInt() + o2.getAnInt());
        else return o1.getAnInt()>o2.getAnInt()?Integer.parseInt(""+ o1.getAnInt() +o2.getAnInt()):Integer.parseInt(""+o2.getAnInt() + o1.getAnInt());
    }

    @Override
    public Comparator<NumClass> reversed() {
        return null;
    }
}
