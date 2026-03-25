//Ceil The Floor problem in Sorted Arrays
// Time Complexity: O(log n) where n is the length of the array, as we perform a binary search to find the floor and ceil.
// Space Complexity: O(1) as we are using only a constant amount of extra space for the floor and ceil variables.

public class CeilTheFloorSA {
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int floor=-1;
        int ceil=-1;

        while(low<=high){
            int mid=(low+high)/2;
        if(arr[mid] ==x) {
            return new int[]{x,x};
        }
        else if(arr[mid] <x) {
            floor=arr[mid];
            low=mid+1;
        }
        else{
            ceil=arr[mid];
            high=mid-1;
        }
        }
        return new int[] {floor,ceil};
        }
        public static void main(String[] args){
            int[] arr={2,4,5,6,8,9};
            int x=7;

            int[] result=getFloorAndCeil(arr, x);
            System.out.println("Floor: " + result[0]);
            System.out.println("Ceil: " + result[1]);
        }
    }
