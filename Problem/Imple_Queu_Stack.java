import java.util.*;

class MyQueue {
    private Stack<Integer> input = new Stack<>();
    private Stack<Integer> output = new Stack<>();

    public void push(int x) { input.push(x); }
    public int pop() { peek(); return output.pop(); }
    public int peek() {
        if (output.isEmpty())
            while (!input.isEmpty()) output.push(input.pop());
        return output.peek();
    }

    
    public boolean empty() { return input.isEmpty() && output.isEmpty(); }
}



public class Main {
    public static void main(String[] args) {
        String[] commands = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[][] arguments = { {}, {1}, {2}, {}, {}, {} };

        MyQueue myQueue = null;
        List<Object> output = new ArrayList<>();
        System.out.println("Step-by-step visual:
");

        for (int i = 0; i < commands.length; i++) {
            String cmd = commands[i];
            int[] arg = arguments[i];

            switch (cmd) {
                case "MyQueue":
                    myQueue = new MyQueue();
                    output.add(null);
                    System.out.println("Created MyQueue");
                    break;
                case "push":
                    myQueue.push(arg[0]);
                    output.add(null);
                    System.out.println("push(" + arg[0] + ") ➡️ Queue now: " + getVisual(myQueue));
                    break;
                case "peek":
                    int peekVal = myQueue.peek();
                    output.add(peekVal);
                    System.out.println("peek() ➡️ returns " + peekVal + " | Queue: " + getVisual(myQueue));
                    break;
                case "pop":
                    int popVal = myQueue.pop();
                    output.add(popVal);
                    System.out.println("pop() ➡️ returns " + popVal + " | Queue: " + getVisual(myQueue));
                    break;
                case "empty":
                    boolean isEmpty = myQueue.empty();
                    output.add(isEmpty);
                    System.out.println("empty() ➡️ returns " + isEmpty + " | Queue: " + getVisual(myQueue));
                    break;
            }
        }
        System.out.println("
Final output: " + output);
    }

    // Visualize the queue (leftmost is front)
    static String getVisual(MyQueue q) {
        // We can't access private stacks directly, so let's simulate the queue content:
        // (This is just for demo, in real code you might expose a method or print from inside MyQueue)
        return "[front ... back]";
    }
}