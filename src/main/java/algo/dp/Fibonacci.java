package algo.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    int calCount = 0;
    int calCountMem = 0;
    Map<Integer, Integer> memMap = new HashMap<>();

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacciNumAtIndex(35));
        System.out.println("CalCount " + fibonacci.calCount);
        System.out.println(fibonacci.fibonacciNumAtIndexMemoized(35));
        System.out.println("CalCountMem " + fibonacci.calCountMem);
    }

    private int fibonacciNumAtIndex(int n) {
        calCount++;
        if (n < 2) {
            return n;
        }
        return fibonacciNumAtIndex(n - 1) + fibonacciNumAtIndex(n - 2);
    }

    private int fibonacciNumAtIndexMemoized(int n) {
        calCountMem++;
        int ans = 0;
        if (n < 2) {
            return n;
        }
        if (memMap.containsKey(n)) {
            ans = memMap.get(n);
        } else {
            ans = fibonacciNumAtIndexMemoized(n - 2);
            memMap.put(n, ans);
        }
        return fibonacciNumAtIndexMemoized(n - 1) + ans;
    }
}
