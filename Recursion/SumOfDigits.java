package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumdigits(-15);
        System.out.println(ans);
    }

    public static int sumdigits(int n){
        //omitting the -ve sign if negative
        if(n<0)
            n=n-(2*n);
        if(n<10){
            return n;
        }
        else{
            return (n%10)+sumdigits(n/10);
        }
    }
}
