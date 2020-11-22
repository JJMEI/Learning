package main.力扣练习.剑指offer;

public class Offer_10_青蛙跳台阶问题 {


    /**
     *    n=1     1
     *    n=2     1,1 or 2
     *    n=3     1,2 or 1,1,1 or 2,1
     *    n=4     1,1,1,1 or 1,1,2 or 1,2,1 or 2,1,1
     *    n=5     1,1,1,1,1 or 1,2,1,1,1,1,2,
     * @param n
     * @return
     */
    public static int numWays(int n) {

        if(n==0||n==1){
            return 1;
        }
        if(1<n && n<4){
            return n;
        }

        int first=2;
        int second=3;

        for(int i=0;i<n-3;i++){
            second = first+second;
            first = second-first;
            second %= 1000000007;
        }
        return second;

    }
}
