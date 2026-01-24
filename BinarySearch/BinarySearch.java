// Basic checks for Binary Search,
// Array should be in any order ascending or descending
// we check order by arr[start]<arr[end]

public class BinarySearch {
    public static void main(String args[]){
        int[] a = {2, 3, 5, 7, 9, 13, 15, 18, 20};
        int tar = 2;
        int res = binary(a, tar);
        System.out.println(res);

    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            } else{
                return mid;
            }
        } 
        return -1;       
    }
}
