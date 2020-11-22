package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayList;
import java.util.List;

public class SumString {
    public List<List<Integer>> generate(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            list.add(i);
        }
        List<List<Integer>> bucket = new ArrayList<>();
        helper("", num, list, bucket);
        return bucket;
    }
    private void helper(String str, int num, List<Integer> list, List<List<Integer>> bucket) {
        if (num < 0)
            return;
        if (num == 0) {
            List<Integer> nums = transformNum(str);
            bucket.add(nums);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String st1 = str + " " + list.get(i);
            helper(st1, num - list.get(i), list, bucket);
        }
    }
    private List<Integer> transformNum(String str) {

        String st1 = str.trim();
        String[] arr = st1.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Integer.valueOf(s));
        }
        return list;
    }
    public List<List<Integer>> generate1(int num){
        List<List<Integer>> bucket = new ArrayList<>();
        List<Integer> range = new ArrayList<>();
        for (int i=1;i<num;i++){
            range.add(i);
        }
        helper1(" ",num,range,bucket);
        return bucket;
    }
    private void helper1(String string, int num, List<Integer> range, List<List<Integer>> bucket) {
        if (num<0)return;
        else if (num == 0){
            bucket.add(transformNum1(string));
            return;
        }
        for (int i=0;i<range.size();i++){
            String str = string +" "+range.get(i);
            helper(str,num-range.get(i),range,bucket);
        }
    }
    private List<Integer> transformNum1(String string) {
        List<Integer> list = new ArrayList<>();
        String st1 = string.trim();
        String[] arr = st1.split(" ");
        for (String s : arr) {
            list.add(Integer.valueOf(s));
        }
        return list;
    }
    public List<List<Integer>> generate2(int num){
        List<List<Integer>> listArrayList = new ArrayList<>();
        List<Integer> range = new ArrayList<>();
        for (int i=1;i<num;i++){
            range.add(i);
        }
        helper2("",num,range,listArrayList);
        return listArrayList;
    }
    private void helper2(String string, int num, List<Integer> range, List<List<Integer>> listArrayList) {
        if (num<0) return;
        else if (num == 0){
            listArrayList.add(transformNum2(string));
        }
        for (int i=0;i<range.size();i++){
            String str = string + " " +range.get(i);
            helper(str,num-range.get(i),range,listArrayList);
        }
    }
    private List<Integer> transformNum2(String string) {
        List<Integer> list = new ArrayList<>();
        String str = string.trim();
        String[] arr = str.split(" ");
        for (String s:arr){
            list.add(Integer.valueOf(s));
        }
        return list;
    }
}
