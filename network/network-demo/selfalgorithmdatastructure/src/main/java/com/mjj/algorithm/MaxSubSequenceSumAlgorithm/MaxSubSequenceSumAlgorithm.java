package com.mjj.algorithm.MaxSubSequenceSumAlgorithm;

public class MaxSubSequenceSumAlgorithm {


    /**
     *array[0]+

     array[0]+array[1]+

     array[0]+array[1]+array[2]+

     array[0]+array[1]+array[2]+array[3]+

     array[0]+array[1]+array[2]+array[3]+array[4]+

     array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+

     array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+

     array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+

     array[1]+

     array[1]+array[2]+

     array[1]+array[2]+array[3]+

     array[1]+array[2]+array[3]+array[4]+

     array[1]+array[2]+array[3]+array[4]+array[5]+

     array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+

     array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+

     array[2]+

     array[2]+array[3]+

     array[2]+array[3]+array[4]+

     array[2]+array[3]+array[4]+array[5]+

     array[2]+array[3]+array[4]+array[5]+array[6]+

     array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+

     array[3]+

     array[3]+array[4]+

     array[3]+array[4]+array[5]+

     array[3]+array[4]+array[5]+array[6]+

     array[3]+array[4]+array[5]+array[6]+array[7]+

     array[4]+

     array[4]+array[5]+

     array[4]+array[5]+array[6]+

     array[4]+array[5]+array[6]+array[7]+

     array[5]+

     array[5]+array[6]+

     array[5]+array[6]+array[7]+

     array[6]+

     array[6]+array[7]+

     array[7]+
     * @param array
     * @return
     */
    public static long maxSubSequenceAlgorithm1(long[] array){
        long maxSum = 0;

        for(int i=0;i<array.length;i++){

            for (int j=i;j<array.length;j++){
                long thisSum = 0;

                for(int k=i;k<=j;k++){
                    thisSum += array[k];

                    System.out.print("array[" + k + "]" + "+");
                }

                System.out.println("\n");
                if(thisSum>maxSum){
                    maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }


    public static long maxSubSequenceAlgorithm2(long[] array){
        long maxSum = 0;

        for(int i=0;i<array.length;i++){

            long thisSum = 0;
            for (int j=i;j<array.length;j++){

                // 利用前一次的计算结果
                thisSum += array[j];

                for(int m=i;m<=j;m++){
                    System.out.print("array["+m+"]" + "+");
                }
                System.out.println();
                if(thisSum>maxSum){
                    maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }




    public static void main(String[] args) {
        System.out.println(maxSubSequenceAlgorithm2(new long[]{23L,-34L,23L,3L,542L,4L,23L,-431L}));
    }
}
