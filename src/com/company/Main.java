package com.company;

public class Main {

    public static int removeDuplicates(int[] array, int size) {
        if (size == 0 || size == 1) {
            return size;
        }
        int j = 0; // store the index of the next unique element
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                // if the next element is NOT a copy then
                array[j++] = array[i];
            }
        }
            array[j++]=array[size-1];
            return j;
    }


    public static void main(String[] args) {
    int[] array={1,2,3,4,4,5,6,6};
        int k= array.length;
        k=removeDuplicates(array,k);
    for(int i=0;i<k;i++)
    {
        System.out.print(array[i]+" ");
    }

    }
}
