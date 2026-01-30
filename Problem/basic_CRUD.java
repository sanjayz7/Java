import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of operations

        int[] arr = new int[100]; // fixed size array
        int size = 0;             // current number of elements

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            int x = sc.nextInt();

            // INSERT
            if (op == 1) {
                arr[size] = x;
                size++;
            }

            // DELETE
            else if (op == 2) {
                int index = -1;
                for (int j = 0; j < size; j++) {
                    if (arr[j] == x) {
                        index = j;
                        break;
                    }
                }

                if (index != -1) {
                    for (int j = index; j < size - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    size--;
                }
            }

            // SEARCH
            else if (op == 3) {
                boolean found = false;
                for (int j = 0; j < size; j++) {
                    if (arr[j] == x) {
                        found = true;
                        break;
                    }
                }

                if (found)
                    System.out.println("Found");
                else
                    System.out.println("Not Found");
            }
        }

        sc.close();
    }
}
