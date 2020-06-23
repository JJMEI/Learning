package com.mjj.gc;

/**
 *
 * -server
 * -Xmx10m -Xms10m   堆大小
 * -XX:+DoEscapeAnalysis  开启逃逸分析  默认启用逃逸分析
 * -XX:+PrintGC      打印GC日志
 * -XX:+EliminateAllocations   标量替换   什么是标量替换  对象被打散 栈上分配
 * -XX:-UseTLAB   ThreadLocalAllocBuffer   线程事先在堆上分配一块内存
 * @author meijunjie
 */
public class StackAlloc {

    public static class User{
        public int id=0;
        public String name="";
    }

    public static void alloc(){
        User user = new User();
        user.id=5;
        user.name="mark";
    }

    public static void main(String[] args) {
        long b = System.currentTimeMillis();
        for(int i=0;i<Integer.MAX_VALUE;i++){
            alloc();
        }

        System.out.println(System.currentTimeMillis()-b);
    }
}
