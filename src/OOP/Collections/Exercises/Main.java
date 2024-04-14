package OOP.Collections.Exercises;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(5);
        queue.add(10);
        queue.add(15);

        for (int i = 0;i<3;i++){
            System.out.println(queue.poll());
        }
    }
}
