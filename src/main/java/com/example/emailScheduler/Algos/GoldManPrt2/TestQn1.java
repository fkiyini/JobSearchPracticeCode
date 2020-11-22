package com.example.emailScheduler.Algos.GoldManPrt2;

import java.util.Arrays;
import java.util.List;

public class TestQn1 {
    public static int maxEvents(List<Integer> arrival, List<Integer> duration)
    {
        int[][] intervals = new int[arrival.size()][];
        for(int i = 0;i < arrival.size();i++)
        {
            intervals[i] = new int[]{arrival.get(i),duration.get(i)+arrival.get(i)};
        }
        Arrays.sort(intervals,(a1, a2) -> Integer.compare(a1[1],a2[1]));
        int currEndTime = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0;i < intervals.length;i++)
        {
            if(intervals[i][0] >= currEndTime)
            {
                currEndTime = intervals[i][1];
                result++;
            }
        }
        return result;
    }
}
