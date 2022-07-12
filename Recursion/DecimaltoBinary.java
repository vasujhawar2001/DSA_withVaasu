package Recursion;

public class DecimaltoBinary {

 public static void main(String[] args) {
  int n=16;
  System.out.println(binary(n));
 }
 public static int binary(int n){
  if(n==0)
   return 0;
  return 10*binary(n/2) + (n%2);
 }
}
