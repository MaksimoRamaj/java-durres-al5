package OOP.Collections;

import OOP.Exceptions.Bank;

import java.util.*;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10 ; i++){
           list.add(random.nextInt(0,100));
        }

        for (Integer i : list){
            System.out.print(i + " ");
        }

        Collections.sort(list);

        for (Integer i : list){
            System.out.print(i + " ");
        }

        List<Integer> list1 = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        int num = queue.poll();
        queue.offer(65);
        queue.size();
        queue.remove();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.pop();

        stack.peek();
        stack.isEmpty();

    }
}
