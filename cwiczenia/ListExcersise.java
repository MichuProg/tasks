package sda.cwiczenia;

import java.util.*;

public class ListExcersise {
    public static void main(String[] args) {
        try {
            Queue<String> queue = new PriorityQueue<>();
            queue.add("First");
            queue.add("Second");
            queue.add("Third");
            while (!queue.isEmpty()) {
                System.out.println("Only peeking -> " + queue.peek());
                System.out.println("Removing -> " + queue.poll());
            }
            Stack<String> stack = new Stack<>();
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            while (!stack.isEmpty()) {
                System.out.println("Only peeking -> " + stack.peek());
                System.out.println("Removing -> " + stack.pop());
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

}