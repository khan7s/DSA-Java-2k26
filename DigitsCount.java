// import java.util.math;

public class DigitsCount{
    public static void main(String args[]){
        int nums = 245235;
        int digit = (int)Math.log10(nums) + 1;
        System.out.println("Digits count of " +nums +" is: " + digit);
    }
}