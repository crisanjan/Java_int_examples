package com.company;

public class RotateArray {
    public void rotate(int[] nums,int k) {
        //we do this to know how many numbers to reverse
        k = k % nums.length;

        //reverse the whole array
        reverse(nums,0, nums.length-1);
        //reverse the first numbers
        reverse(nums,0, k-1);
        //reverse the leftover numbers
        reverse(nums,k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        if(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray=new RotateArray();
        int[] array={1,2,3,4,5,6};
        int k=2;
        rotateArray.reverse(array,0, array.length-1);
    }
}
