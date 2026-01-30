import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of operations

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();   // operation type

            if (op == 1) {
                int x = sc.nextInt();   // enqueue
                queue.offer(x);
            } 
            else if (op == 2) {
                if (!queue.isEmpty()) {
                    queue.poll();   // dequeue
                }
            }
        }

        // Print final queue
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int val : queue) {
                System.out.print(val + " ");
            }
        }

        sc.close();
    }
}
