public class SumOfDigits{
    public static void main(String[] args){
        long num = 38293l;
        while(num > 9){
           num = digitSum(num);
        }
        System.out.println(num);
    }

    static int digitSum(long num){
        int res = 0;
        while (num>0) {
            res += num%10;
            num/=10;
        }
        return res;
    }
}