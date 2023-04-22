package Recursion;

public class Power {
    public static void main(String[] args) {
        double ans = power(5,3);
        System.out.println(ans);
    }
    public static double power(double n, double exp){
        if(exp<0) {
            n = 1 / n;
            exp = exp - (2 * exp);
        }
        if(exp==0) {
            return 1;
        }
        else{
            return n*power(n,exp-1);
        }
    }
}
