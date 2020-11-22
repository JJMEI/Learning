package main.力扣练习.栈;

import java.util.Stack;

public class LeetCode_856_括号的分数 {

    /**
     * (()(()))
     *
     * i= 0   stack   0
     * i= 1   stack   0,0
     * i= 2   stack peek = 0  合成  stack 0,1
     * i=3    stack 0,1,0
     * i=4    stack 0,1,0,0
     * i=5    stack 0,1,0,1
     * i=6 stack 0,1,0,1,0
     * @param S
     * @return
     */
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();

        int sLength = S.length();

        for(int i=0;i<sLength;i++){
            char tempChar = S.charAt(i);

            if(tempChar == '('){
                stack.push(0);
            }else {
                // 这时候要判断栈顶的元素
                // '('
                if(stack.peek() == 0){
                    stack.pop();
                    stack.push(1);
                }else {
                    // 栈顶不是 '('
                    // 弹出顶部数据
                    int sum = 0;
                    while(stack.peek() != 0){
                        sum +=stack.pop();
                    }

                    stack.pop();

                    stack.push(sum*2);

                }
            }
        }

        int result=0;
        while (!stack.isEmpty()){
            result +=stack.pop();
        }
        return result;
    }
}
