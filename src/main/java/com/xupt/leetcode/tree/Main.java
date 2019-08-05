package com.xupt.leetcode.tree;

public class Main {
    interface A {
        void f();
    }

    static class B implements A {

        @Override
        public void f() {
            System.out.println("B.f");
        }

        public void g() {
            System.out.println("B.g");
        }
    }

    public static void main(String[] args) {
        A a = new B();
        a.f();
        try{
            System.out.println(a.getClass().getName());
            B b = (B)a;
            b.g();
        } catch (Exception e) {
            System.out.println("E");
        }
    }
}
