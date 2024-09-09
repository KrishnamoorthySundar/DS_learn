package algo.dp;

public class ClimbingStairs {
    //You are climbing a staircase. It takes n steps to reach the top.
    //
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public static void main(String[] args) {
        System.out.println(howManyWays(5));
    }

    private static int howManyWays(int n) {
        //before coding need to analyse the pattern.
        /*ans format is as below
                1->1
                2->2
                3->3
                4->5
                5->8
                ...
                ...*/
        if (n == 1 || n == 2) return n;
        int one = 1;
        int two = 2;
        for (int i = 3; i <= n; i++) {
            int third = one + two;
            one = two;
            two = third;
        }
        return two;
    }
}
