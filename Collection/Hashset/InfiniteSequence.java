import java.util.*;

class Main {
    // Helper function to generate the next number in sequence
    public static int next(int value) {
        if (value % 2 == 0) {
            return value / 2;
        } else {
            return value * 3 + 3;
        }
    }

    public static String checkSequenceTermination(int n) {
        Set<Integer> visited = new HashSet<>();

        while (n != 1) {
            if (visited.contains(n)) {
                // Loop detected
                return "NO";
            }
            visited.add(n);
            n = next(n);
        }

        // If we reach 1, it terminates
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = checkSequenceTermination(n);
        System.out.println(result);
    }
}

/*
 * Problem Statement
For any integer N, we have created a sequence such that the following function determines the next term in the sequence:

a(N+1) = f(a(N)) = 3 * (a(N)) + 3 if a(N) = odd
a(N+1) = f(a(N)) = a(N)/2 if a(N) = even
The sequence terminates if, for some element a(i), we get f(a(i)) = 1.

Examples:

For N = 2, f(2) = 1, so the sequence is 2, 1.
For N = 3, f(3) = 12, f(12) = 6, f(6) = 3, f(3) = 12….., so we can see that this is an infinite sequence.
Given any integer N, can you predict whether the sequence terminates?

Input Format
The first line of input contains an integer N, for which we need to determine whether the sequence is infinite or not.
Output Format
Print “YES” if the sequence terminates otherwise, print “NO”.
Note: The output is case-sensitive.
Constraints
1 <= N <= 10^6
Sample Testcase 0
Testcase Input
4
Testcase Output
YES
Explanation
For n=4, we can see that the sequence is 4,2,1, and so it terminates.
Sample Testcase 1
Testcase Input
3
Testcase Output
NO
Explanation
For n=3, we can see that the sequence is 3, 12, 6, 3, 12, 6…. and it can be seen that it will never reach 1.
 */