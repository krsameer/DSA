//Leetcode 283
//Move all zeros to the end of the array while maintaining the relative order of the non-zero elements.
//Time Complexity: O(n) for traversing the array once
//Space Complexity: O(1) as we are modifying the array in place without using extra

import java.util.*;
public class MoveZeros{
    public static void main(String[] args){
        int[] arr={1,0,2,0,3,0,4,0,5};
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                arr[p]=arr[i];
                p++;
            }
        }
        while(p<arr.length){
            arr[p]=0;
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}