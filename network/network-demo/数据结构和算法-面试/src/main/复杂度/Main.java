package main.复杂度;

public class Main {


    /**
     * 斐波那契数列
     * <p>
     * f(n) = f(n-1) + f(n-2)
     * <p>
     * 0 1 1 2 3 5 8 13 21 33 54 87
     *
     * @param n
     * @return
     */
    public static int fib1(int n) {

        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }


    public static int fib2(int n) {

        if(n<=1){
            return n;
        }
        int first = 0;
        int second = 1;

        for(int i=0;i<n-1;i++){
            second = first + second;
            first = second - first;
        }

        return second;
    }

    public static void main(String[] args) {
//        System.out.println(fib1(0));
//        System.out.println(fib1(1));
//        System.out.println(fib1(2));
//        System.out.println(fib1(3));
//        System.out.println(fib1(4));
//        System.out.println(fib1(5));
//        System.out.println(fib1(6));
//        System.out.println(fib1(7));
//        System.out.println(fib1(40));


        System.out.println(fib2(0));
        System.out.println(fib2(1));
        System.out.println(fib2(2));
        System.out.println(fib2(3));
        System.out.println(fib2(4));
        System.out.println(fib2(5));
        System.out.println(fib2(6));
        System.out.println(fib2(7));
        System.out.println(fib2(45));

    }
}
