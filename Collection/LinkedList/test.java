package Collection.LinkedList;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");


        System.out.println(l1);
        l1.addFirst("Suriya");
        l1.addLast("Kumar");
        System.out.println(l1);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.get(2));

    }
}
