import java.util.Arrays;
//Rotate array by k
public class RotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int n = arr.length;
        k = k%n;

        rotate(arr, 0, n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] a, int start, int last){
        while(start <= last){
            int temp = a[start];
            a[start] = a[last];
            a[last] = temp;

            start++;
            last--;
        }
    }
}
