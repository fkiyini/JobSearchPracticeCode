package com.example.emailScheduler.Algos.GoldMan.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumClass {
    private Integer anInt;

    public Integer getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    static class ValueComparator implements Comparator<NumClass> {

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
    public static void main(String[] args) {
        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        Collections.sort(list, new ValueComparator());
        System.out.println(list);
    }

}
