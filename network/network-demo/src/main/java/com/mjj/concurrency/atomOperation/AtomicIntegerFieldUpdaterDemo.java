package com.mjj.concurrency.atomOperation;

public class AtomicIntegerFieldUpdaterDemo {

    static class Candidate{
        int id;
        volatile int score;
    }

    static class Game{
        int id;
        volatile String name;

        public Game(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Game{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }


    }
}
