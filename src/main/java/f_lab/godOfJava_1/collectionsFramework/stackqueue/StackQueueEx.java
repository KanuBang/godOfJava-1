package f_lab.godOfJava_1.collectionsFramework.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack<Object> st = new Stack<>();
        Queue<Object> q = new LinkedList<>();

        int size = 3;
        for(int i = 0; i < size; i++) {
            st.push(i);
            q.offer(i);
        }

        System.out.println("= stack =");
        while(!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= queue =");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
}
