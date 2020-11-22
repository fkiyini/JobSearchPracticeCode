package com.example.emailScheduler.GoldManPrt6;


public class IsBalanced{

    public static Boolean isBalanced(int[] array){
        int sum = 0;
        int sum2 = 0;
        int len = array.length;

        for(int i:array){
            sum+=i;
        }
        int i = 1;
        int mid = sum/2;
        sum2 = array[0];
        if(sum%2 !=0) return false;
        else{
            while(i<len && sum2<=mid){
                sum2+=array[i];
                i++;
                if(sum2==mid){
                    return true;
                }
                // else{
                //     // sum2-=array[i];
                //     // i++;
                //   return false;
                // }
            }
        }

        // if(sum2 = mid)
        return false;
        // else
    }


    public static void main(String [] args ){

        int [] arr = {0, 0, 7, 4, 3};
        System.out.println(isBalanced(arr));

    }

}

