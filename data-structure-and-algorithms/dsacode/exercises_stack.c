/*
 * STACK EXERCISES
 * Complete the functions as described in each exercise.
 * Test your solutions using the main() function provided.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

// Stack structure
int stack[MAX];
int top = -1;

// Basic stack operations (provided)
int isEmpty() {
    return top == -1;
}

int isFull() {
    return top == MAX - 1;
}

void push(int value) {
    if (isFull()) {
        printf("Stack Overflow!\n");
        return;
    }
    stack[++top] = value;
}

int pop() {
    if (isEmpty()) {
        printf("Stack Underflow!\n");
        return -1;
    }
    return stack[top--];
}

int peek() {
    if (isEmpty()) {
        return -1;
    }
    return stack[top];
}

void display() {
    if (isEmpty()) {
        printf("Stack is empty\n");
        return;
    }
    printf("Stack (top to bottom): ");
    for (int i = top; i >= 0; i--) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}

void clear() {
    top = -1;
}

// ============================================================
// EXERCISE 1: Stack Size
// Write a function that returns the current number of
// elements in the stack.
// ============================================================
int stack_size() {
    // TODO: Implement this function
    // Return the number of elements in stack
    return 0;
}

// ============================================================
// EXERCISE 2: Find Minimum Element
// Write a function that finds the minimum element in the
// stack WITHOUT removing any elements.
// Return -1 if stack is empty.
// ============================================================
int find_min() {
    // TODO: Implement this function
    // Hint: You may need to pop and push elements
    return -1;
}

// ============================================================
// EXERCISE 3: Find Maximum Element
// Write a function that finds the maximum element in the
// stack WITHOUT removing any elements.
// Return -1 if stack is empty.
// ============================================================
int find_max() {
    // TODO: Implement this function
    return -1;
}

// ============================================================
// EXERCISE 4: Reverse Stack
// Write a function that reverses the order of elements
// in the stack using only stack operations.
// Hint: You may use an auxiliary array
// ============================================================
void reverse_stack() {
    // TODO: Implement this function
}

// ============================================================
// EXERCISE 5: Check Balanced Parentheses
// Write a function that checks if a string has balanced
// parentheses. Consider only '(' and ')'.
// Return 1 if balanced, 0 if not balanced.
// Example: "((()))" -> balanced, "(()" -> not balanced
// ============================================================
int is_balanced_parentheses(char *str) {
    // TODO: Implement this function
    // Hint: Push '(' and pop when ')' is found
    return 0;
}

// ============================================================
// EXERCISE 6: Check Balanced Brackets
// Extended version: Check for '(', ')', '{', '}', '[', ']'
// Return 1 if balanced, 0 if not balanced.
// Example: "{[()]}" -> balanced, "{[(])}" -> not balanced
// ============================================================
int is_balanced_brackets(char *str) {
    // TODO: Implement this function
    // Hint: Store opening brackets, match with closing
    return 0;
}

// ============================================================
// EXERCISE 7: Evaluate Postfix Expression
// Write a function that evaluates a postfix expression.
// The expression contains single digit operands and operators +,-,*,/
// Example: "23+" = 5, "231*+" = 5
// Return the result of the expression.
// ============================================================
int evaluate_postfix(char *expr) {
    // TODO: Implement this function
    // Hint: Push operands, pop two and apply operator
    return 0;
}

// ============================================================
// EXERCISE 8: Sort Stack
// Write a function that sorts the stack in ascending order
// (smallest on top) using only one additional temporary stack.
// ============================================================
void sort_stack() {
    // TODO: Implement this function
    // Hint: Use a temporary stack to hold sorted elements
}

// ============================================================
// EXERCISE 9: Insert at Bottom
// Write a function that inserts an element at the bottom
// of the stack WITHOUT using any auxiliary data structure.
// Use recursion.
// ============================================================
void insert_at_bottom(int value) {
    // TODO: Implement this function
    // Hint: Use recursion - pop all, insert, push back
}

// ============================================================
// EXERCISE 10: Delete Middle Element
// Write a function that deletes the middle element of the stack.
// If stack has n elements, delete element at position n/2 + 1
// (1-indexed from bottom).
// ============================================================
void delete_middle() {
    // TODO: Implement this function
    // Hint: Count elements, use recursion or auxiliary storage
}

// ============================================================
// EXERCISE 11: Next Greater Element
// For each element in an array, find the next greater element
// to its right. Print -1 if no greater element exists.
// Input: arr[] = {4, 5, 2, 25}
// Output: 5 25 25 -1
// ============================================================
void next_greater_element(int arr[], int n) {
    // TODO: Implement this function
    // Hint: Process array from right to left using stack
    printf("Next greater elements: ");
    // Print results
    printf("\n");
}

// ============================================================
// EXERCISE 12: Stock Span Problem
// The stock span of a day is the number of consecutive days
// just before the given day where the price was less than or
// equal to the price on the given day.
// Input: prices[] = {100, 80, 60, 70, 60, 75, 85}
// Output: 1 1 1 2 1 4 6
// ============================================================
void stock_span(int prices[], int n) {
    // TODO: Implement this function
    // Hint: Use stack to store indices
    printf("Stock spans: ");
    // Print results
    printf("\n");
}

// ============================================================
// BONUS: Implement Two Stacks in One Array
// Implement two stacks in a single array efficiently.
// Stack1 grows from left, Stack2 grows from right.
// ============================================================

// For bonus exercise
int two_stacks[MAX];
int top1 = -1;
int top2 = MAX;

void push1(int value) {
    // TODO: Push to stack 1
}

void push2(int value) {
    // TODO: Push to stack 2
}

int pop1() {
    // TODO: Pop from stack 1
    return -1;
}

int pop2() {
    // TODO: Pop from stack 2
    return -1;
}

int main() {
    int choice, value, n;
    char str[100];
    int arr[20];

    do {
        printf("\n===== STACK EXERCISES TEST MENU =====\n");
        printf("1. Push element\n");
        printf("2. Pop element\n");
        printf("3. Display stack\n");
        printf("4. Clear stack\n");
        printf("--- Exercise Tests ---\n");
        printf("5. Test stack_size()\n");
        printf("6. Test find_min()\n");
        printf("7. Test find_max()\n");
        printf("8. Test reverse_stack()\n");
        printf("9. Test is_balanced_parentheses()\n");
        printf("10. Test is_balanced_brackets()\n");
        printf("11. Test evaluate_postfix()\n");
        printf("12. Test sort_stack()\n");
        printf("13. Test insert_at_bottom()\n");
        printf("14. Test delete_middle()\n");
        printf("15. Test next_greater_element()\n");
        printf("16. Test stock_span()\n");
        printf("0. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(value);
                display();
                break;
            case 2:
                value = pop();
                if (value != -1)
                    printf("Popped: %d\n", value);
                display();
                break;
            case 3:
                display();
                break;
            case 4:
                clear();
                printf("Stack cleared.\n");
                break;
            case 5:
                printf("Stack size: %d\n", stack_size());
                break;
            case 6:
                value = find_min();
                if (value == -1)
                    printf("Stack is empty.\n");
                else
                    printf("Minimum: %d\n", value);
                break;
            case 7:
                value = find_max();
                if (value == -1)
                    printf("Stack is empty.\n");
                else
                    printf("Maximum: %d\n", value);
                break;
            case 8:
                reverse_stack();
                printf("Stack reversed.\n");
                display();
                break;
            case 9:
                printf("Enter string with parentheses: ");
                scanf("%s", str);
                if (is_balanced_parentheses(str))
                    printf("Balanced!\n");
                else
                    printf("Not balanced!\n");
                break;
            case 10:
                printf("Enter string with brackets: ");
                scanf("%s", str);
                if (is_balanced_brackets(str))
                    printf("Balanced!\n");
                else
                    printf("Not balanced!\n");
                break;
            case 11:
                printf("Enter postfix expression: ");
                scanf("%s", str);
                printf("Result: %d\n", evaluate_postfix(str));
                break;
            case 12:
                sort_stack();
                printf("Stack sorted.\n");
                display();
                break;
            case 13:
                printf("Enter value to insert at bottom: ");
                scanf("%d", &value);
                insert_at_bottom(value);
                display();
                break;
            case 14:
                delete_middle();
                printf("Middle element deleted.\n");
                display();
                break;
            case 15:
                printf("Enter number of elements: ");
                scanf("%d", &n);
                printf("Enter %d elements: ", n);
                for (int i = 0; i < n; i++)
                    scanf("%d", &arr[i]);
                next_greater_element(arr, n);
                break;
            case 16:
                printf("Enter number of days: ");
                scanf("%d", &n);
                printf("Enter %d prices: ", n);
                for (int i = 0; i < n; i++)
                    scanf("%d", &arr[i]);
                stock_span(arr, n);
                break;
            case 0:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    } while (choice != 0);

    return 0;
}
