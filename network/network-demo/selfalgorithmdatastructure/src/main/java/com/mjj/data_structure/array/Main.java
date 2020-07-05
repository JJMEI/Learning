package com.mjj.data_structure.array;

public class Main {


    /**
     * 0 1 1 2 3 5 8 13 ...
     * @param n
     * @return
     */
    public static int fbnc(int n){
        if(n<=1){
            return n;
        }
        return fbnc(n-1) + fbnc(n-2);

    }



    public static int fbnc2(int n){
        if(n<=1){
            return n;
        }

        int first = 0;
        int second = 1;

        for(int i=1;i<n;i++){
            second = second + first;
            System.out.print ("a[" + (i+1)+"]=" + second + " + " + first +"     ");
            first = second - first;
            System.out.println("a["+i+"]=" + first);

        }

        return second;


    }
    public static void main(String[] args) {
        System.out.println(fbnc2(10));
    }
}
