package algo.recursion;

public class Factorial {

    int counter = 0;
    int answer = 1;
    public int findFactorialRecursively(int num){
        if(num==2){
            return answer*2;
        }
        return answer * findFactorialRecursively(num-1);
    }

    public void findFactorial(int num){
        int ans = 1;
        for(int i=num;i>0;i--){
            ans = ans * i;
        }
        System.out.println("Factorial of "+num+" is -> "+ans);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorialRecursively(5));
    }
}
