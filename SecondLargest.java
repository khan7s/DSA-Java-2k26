
public class SecondLargest {

     public static void main(String[] args) {
        // int[] arr = {313,13,111,424,55,23,90};
        // int[] arr2 = {1,2};
        // int[] arr3 = {233};
        int[] arr4 = { 2,2,2,2,2,2,2,2};
        System.out.println(second(arr4));
     }

     static int second(int[] a){
        int secondlast = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: a){
            if(i > max){
                secondlast = max;
                max = i;
            }else if(i > secondlast && i != max){
                secondlast = i;
            }
        }
        if(secondlast == Integer.MIN_VALUE)
            throw new IllegalArgumentException("No Second Largest value");
        return secondlast;
     }
}