/*
test cases
{1, 2, 3, 4} k = 10
{3, 3, 3, 3}, k = 6
{-1, -2, 3, 7, 6} k = 5
 */

import java.util.HashSet;

public class PairSumCount{
    public static void main(String[] args){
        int[] list = {1,5,7,1};
        int k = 6;

        // int count = 0;
        // for(int i = 0; i<list.length;i++){
        //     for(int j = i+1; j<list.length;j++){
        //         if(list[i] + list[j] == k){
        //             count++;
        //         }
        //     }
        // }
        System.out.println(count(list, k));
    }
    static int count(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        int c = 0;
        for(int a:arr){
            if(set.contains(k-a)){
                c++;
                set.remove(k-a);
            }
            set.add(a);
        }
        return c;
    }
}