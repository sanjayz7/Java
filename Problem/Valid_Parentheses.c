#include <stdio.h>

#define MAX 100

int isValid(char s[]) {
    char stack[MAX];
    int top = -1;

    for (int i = 0; s[i] != '\0'; i++) {
        char ch = s[i];

        // push opening brackets
        if (ch == '(' || ch == '{' || ch == '[') {
            stack[++top] = ch;
        }
        // handle closing brackets
        else if (ch == ')' || ch == '}' || ch == ']') {

            if (top == -1)
                return 0;   // false

            char last = stack[top--];

            if ((ch == ')' && last != '(') ||
                (ch == '}' && last != '{') ||
                (ch == ']' && last != '[')) {
                return 0;   // false
            }
        }
    }

    return top == -1;   // true if stack empty
}

int main() {
    char s[MAX];

    scanf("%s", s);

    if (isValid(s))
        printf("true");
    else
        printf("false");

    return 0;
}
