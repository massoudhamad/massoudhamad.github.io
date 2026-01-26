/*
 * QUEUE EXERCISES
 * Complete the functions as described in each exercise.
 * Test your solutions using the main() function provided.
 */

#include <stdio.h>
#include <stdlib.h>

#define MAX 100

// Simple Linear Queue structure
int queue[MAX];
int front = -1;
int rear = -1;

// Basic queue operations (provided)
int isEmpty() {
    return front == -1;
}

int isFull() {
    return rear == MAX - 1;
}

void enqueue(int value) {
    if (isFull()) {
        printf("Queue Overflow!\n");
        return;
    }
    if (front == -1) front = 0;
    queue[++rear] = value;
}

int dequeue() {
    if (isEmpty()) {
        printf("Queue Underflow!\n");
        return -1;
    }
    int value = queue[front];
    if (front == rear) {
        front = rear = -1;
    } else {
        front++;
    }
    return value;
}

int peek_front() {
    if (isEmpty()) return -1;
    return queue[front];
}

void display() {
    if (isEmpty()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue (front to rear): ");
    for (int i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

void clear() {
    front = rear = -1;
}

// ============================================================
// EXERCISE 1: Queue Size
// Write a function that returns the current number of
// elements in the queue.
// ============================================================
int queue_size() {
    // TODO: Implement this function
    // Return the number of elements in queue
    return 0;
}

// ============================================================
// EXERCISE 2: Find Minimum Element
// Write a function that finds the minimum element in the
// queue WITHOUT permanently removing any elements.
// Return -1 if queue is empty.
// ============================================================
int find_min() {
    // TODO: Implement this function
    return -1;
}

// ============================================================
// EXERCISE 3: Find Maximum Element
// Write a function that finds the maximum element in the
// queue WITHOUT permanently removing any elements.
// Return -1 if queue is empty.
// ============================================================
int find_max() {
    // TODO: Implement this function
    return -1;
}

// ============================================================
// EXERCISE 4: Reverse Queue
// Write a function that reverses the order of elements
// in the queue using an auxiliary stack (array).
// ============================================================
void reverse_queue() {
    // TODO: Implement this function
    // Hint: Use a stack to reverse
}

// ============================================================
// EXERCISE 5: Implement Circular Queue
// Complete the circular queue operations below.
// A circular queue reuses empty spaces at the beginning.
// ============================================================

int cqueue[MAX];
int cfront = -1;
int crear = -1;

int cq_isEmpty() {
    // TODO: Implement this function
    return 1;
}

int cq_isFull() {
    // TODO: Implement this function
    // Hint: Full when (rear + 1) % MAX == front
    return 0;
}

void cq_enqueue(int value) {
    // TODO: Implement this function
    // Hint: rear = (rear + 1) % MAX
}

int cq_dequeue() {
    // TODO: Implement this function
    // Hint: front = (front + 1) % MAX
    return -1;
}

void cq_display() {
    // TODO: Implement this function
    // Hint: Handle wrap-around from rear to front
    printf("Circular Queue: ");
    printf("\n");
}

// ============================================================
// EXERCISE 6: Implement Queue using Two Stacks
// Implement a queue using two stacks (stack1 and stack2).
// This demonstrates a classic interview question.
// ============================================================

int stack1[MAX], stack2[MAX];
int top1 = -1, top2 = -1;

void twostack_enqueue(int value) {
    // TODO: Implement this function
    // Hint: Simply push to stack1
}

int twostack_dequeue() {
    // TODO: Implement this function
    // Hint: If stack2 empty, move all from stack1 to stack2
    // Then pop from stack2
    return -1;
}

// ============================================================
// EXERCISE 7: Generate Binary Numbers 1 to N
// Use a queue to generate binary representations of
// numbers from 1 to N.
// Example: N=5 -> "1", "10", "11", "100", "101"
// ============================================================
void generate_binary(int n) {
    // TODO: Implement this function
    // Hint: Start with "1", then for each, append "0" and "1"
    printf("Binary numbers from 1 to %d:\n", n);
}

// ============================================================
// EXERCISE 8: Sort Queue
// Write a function that sorts the queue in ascending order
// using only queue operations (enqueue, dequeue, peek).
// ============================================================
void sort_queue() {
    // TODO: Implement this function
}

// ============================================================
// EXERCISE 9: Interleave Queue
// Given a queue of even length, rearrange elements by
// interleaving the first half with the second half.
// Input: [1, 2, 3, 4, 5, 6]
// Output: [1, 4, 2, 5, 3, 6]
// ============================================================
void interleave_queue() {
    // TODO: Implement this function
    // Hint: Use a stack for the first half
}

// ============================================================
// EXERCISE 10: Implement Priority Queue (Simple Version)
// Elements with higher priority (higher value) are dequeued first.
// If priorities are equal, follow FIFO order.
// ============================================================

struct pq_element {
    int data;
    int priority;
};

struct pq_element pqueue[MAX];
int pq_size = 0;

void pq_enqueue(int data, int priority) {
    // TODO: Implement this function
    // Insert element maintaining priority order
}

int pq_dequeue() {
    // TODO: Implement this function
    // Remove and return highest priority element
    return -1;
}

void pq_display() {
    // TODO: Implement this function
    printf("Priority Queue: ");
    printf("\n");
}

// ============================================================
// EXERCISE 11: First Non-Repeating Character in Stream
// Given a stream of characters, find the first non-repeating
// character at each point. Print '#' if all characters repeat.
// Input: "aabcbc"
// Output: a # b b c c
// ============================================================
void first_non_repeating(char *stream) {
    // TODO: Implement this function
    // Hint: Use queue and frequency array
    printf("First non-repeating at each position: ");
    printf("\n");
}

// ============================================================
// EXERCISE 12: Implement Deque (Double-Ended Queue)
// A deque allows insertion and deletion at both ends.
// ============================================================

int deque[MAX];
int dfront = -1, drear = -1;

void deque_insert_front(int value) {
    // TODO: Implement this function
}

void deque_insert_rear(int value) {
    // TODO: Implement this function
}

int deque_delete_front() {
    // TODO: Implement this function
    return -1;
}

int deque_delete_rear() {
    // TODO: Implement this function
    return -1;
}

void deque_display() {
    // TODO: Implement this function
    printf("Deque: ");
    printf("\n");
}

int main() {
    int choice, value, n, priority;
    char str[100];

    do {
        printf("\n===== QUEUE EXERCISES TEST MENU =====\n");
        printf("1. Enqueue element\n");
        printf("2. Dequeue element\n");
        printf("3. Display queue\n");
        printf("4. Clear queue\n");
        printf("--- Exercise Tests ---\n");
        printf("5. Test queue_size()\n");
        printf("6. Test find_min()\n");
        printf("7. Test find_max()\n");
        printf("8. Test reverse_queue()\n");
        printf("--- Circular Queue ---\n");
        printf("9. CQ Enqueue\n");
        printf("10. CQ Dequeue\n");
        printf("11. CQ Display\n");
        printf("--- Two Stack Queue ---\n");
        printf("12. TS Enqueue\n");
        printf("13. TS Dequeue\n");
        printf("--- Other Exercises ---\n");
        printf("14. Test generate_binary(n)\n");
        printf("15. Test sort_queue()\n");
        printf("16. Test interleave_queue()\n");
        printf("--- Priority Queue ---\n");
        printf("17. PQ Enqueue\n");
        printf("18. PQ Dequeue\n");
        printf("19. PQ Display\n");
        printf("--- Deque ---\n");
        printf("20. Deque Insert Front\n");
        printf("21. Deque Insert Rear\n");
        printf("22. Deque Delete Front\n");
        printf("23. Deque Delete Rear\n");
        printf("24. Deque Display\n");
        printf("--- String Exercise ---\n");
        printf("25. First non-repeating character\n");
        printf("0. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                enqueue(value);
                display();
                break;
            case 2:
                value = dequeue();
                if (value != -1)
                    printf("Dequeued: %d\n", value);
                display();
                break;
            case 3:
                display();
                break;
            case 4:
                clear();
                printf("Queue cleared.\n");
                break;
            case 5:
                printf("Queue size: %d\n", queue_size());
                break;
            case 6:
                value = find_min();
                if (value == -1)
                    printf("Queue is empty.\n");
                else
                    printf("Minimum: %d\n", value);
                break;
            case 7:
                value = find_max();
                if (value == -1)
                    printf("Queue is empty.\n");
                else
                    printf("Maximum: %d\n", value);
                break;
            case 8:
                reverse_queue();
                printf("Queue reversed.\n");
                display();
                break;
            case 9:
                printf("Enter value for circular queue: ");
                scanf("%d", &value);
                cq_enqueue(value);
                cq_display();
                break;
            case 10:
                value = cq_dequeue();
                if (value != -1)
                    printf("CQ Dequeued: %d\n", value);
                cq_display();
                break;
            case 11:
                cq_display();
                break;
            case 12:
                printf("Enter value for two-stack queue: ");
                scanf("%d", &value);
                twostack_enqueue(value);
                printf("Enqueued.\n");
                break;
            case 13:
                value = twostack_dequeue();
                if (value != -1)
                    printf("TS Dequeued: %d\n", value);
                break;
            case 14:
                printf("Enter N: ");
                scanf("%d", &n);
                generate_binary(n);
                break;
            case 15:
                sort_queue();
                printf("Queue sorted.\n");
                display();
                break;
            case 16:
                interleave_queue();
                printf("Queue interleaved.\n");
                display();
                break;
            case 17:
                printf("Enter data: ");
                scanf("%d", &value);
                printf("Enter priority: ");
                scanf("%d", &priority);
                pq_enqueue(value, priority);
                pq_display();
                break;
            case 18:
                value = pq_dequeue();
                if (value != -1)
                    printf("PQ Dequeued: %d\n", value);
                pq_display();
                break;
            case 19:
                pq_display();
                break;
            case 20:
                printf("Enter value: ");
                scanf("%d", &value);
                deque_insert_front(value);
                deque_display();
                break;
            case 21:
                printf("Enter value: ");
                scanf("%d", &value);
                deque_insert_rear(value);
                deque_display();
                break;
            case 22:
                value = deque_delete_front();
                if (value != -1)
                    printf("Deleted from front: %d\n", value);
                deque_display();
                break;
            case 23:
                value = deque_delete_rear();
                if (value != -1)
                    printf("Deleted from rear: %d\n", value);
                deque_display();
                break;
            case 24:
                deque_display();
                break;
            case 25:
                printf("Enter character stream: ");
                scanf("%s", str);
                first_non_repeating(str);
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
