package com.company;

import java.util.Arrays;

public class Solution {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int middle = (high + low + 1)/2;


        while(low<=high){


             if(target<nums[middle]){
                high = middle-1;  //int is more than middle, list cut in half


             }
            else if (target>nums[middle]){
                low = middle+1; //target is less  than middle


             }
            if(target == nums[middle]){
                System.out.println(target + " eksisterer i listen og ligger i index "+ middle);
                break;
                //int is in the middle

            }

            middle = (low + high)/2;

        }

        if (target != nums[middle]){
            //System.out.println(-1);

        }
        return -1;
    }


        public static void main(String[] args) {
            int[] nums = {-1,0,3,5,9,12};
            int target = 9; //denne her er indexen vi har ikke index større enn 5
            search(nums, target);
            target = 2;
            search(nums, target);


        }
        //hvorfor er target index og ikke tallet vi spør om, hvorfor viser den bare lengden










}
