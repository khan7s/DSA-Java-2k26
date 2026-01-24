public class LCM_GCD {
    public static void main(String[] args) {
        int a = 3242;
        int b = 42;
        System.out.println("GCD: " + gcd(a, b));
        int lcm = (a * b)/gcd(a, b);
        System.out.println("LCM: "+lcm);
        System.out.println("Total: "+ a*b);
    }

    static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
