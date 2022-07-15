package Recursion;

import java.util.Arrays;

public class StupExercise {
    public static void main(String[] args) {
        boolean ans;
        OddFunction odd = new OddFunction();
        ans = someRecursive(new int[]{4, 6, 11, 10, 12}, odd);
        System.out.println(ans);
    }
    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0 ) {
            return false;
        } else if (odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }
    public static class OddFunction {
        boolean run(int num) {
            if (num % 2 == 0) {
                return false; }
            else {
                return true;
            }
        }
    }

}
