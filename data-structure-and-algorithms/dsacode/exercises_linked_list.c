/*
 * LINKED LIST EXERCISES
 * Complete the functions as described in each exercise.
 * Test your solutions using the main() function provided.
 */

#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;

// Helper function to create a node
struct node* create_node(int value) {
    struct node *nw = (struct node*)malloc(sizeof(struct node));
    nw->data = value;
    nw->next = NULL;
    return nw;
}

// Helper function to display list
void display() {
    struct node *temp = head;
    if (temp == NULL) {
        printf("List is empty\n");
        return;
    }
    printf("List: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Helper function to append a node at end
void append(int value) {
    struct node *nw = create_node(value);
    if (head == NULL) {
        head = nw;
        return;
    }
    struct node *temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = nw;
}

// ============================================================
// EXERCISE 1: Count Nodes
// Write a function that counts and returns the total number
// of nodes in the linked list.
// ============================================================
int count_nodes() {
    // TODO: Implement this function
    // Return the total count of nodes
    return 0;
}

// ============================================================
// EXERCISE 2: Sum of All Elements
// Write a function that returns the sum of all data values
// in the linked list.
// ============================================================
int sum_of_elements() {
    // TODO: Implement this function
    // Return the sum of all node values
    return 0;
}

// ============================================================
// EXERCISE 3: Find Maximum Value
// Write a function that finds and returns the maximum value
// in the linked list. Return -1 if list is empty.
// ============================================================
int find_max() {
    // TODO: Implement this function
    // Return the maximum value, or -1 if empty
    return -1;
}

// ============================================================
// EXERCISE 4: Find Minimum Value
// Write a function that finds and returns the minimum value
// in the linked list. Return -1 if list is empty.
// ============================================================
int find_min() {
    // TODO: Implement this function
    // Return the minimum value, or -1 if empty
    return -1;
}

// ============================================================
// EXERCISE 5: Search Element
// Write a function that searches for a value and returns
// its position (1-based index). Return -1 if not found.
// ============================================================
int search(int value) {
    // TODO: Implement this function
    // Return position (1-based) or -1 if not found
    return -1;
}

// ============================================================
// EXERCISE 6: Get Nth Node
// Write a function that returns the value at position n
// (1-based index). Return -1 if position is invalid.
// ============================================================
int get_nth_node(int n) {
    // TODO: Implement this function
    // Return value at position n, or -1 if invalid
    return -1;
}

// ============================================================
// EXERCISE 7: Reverse the List
// Write a function that reverses the linked list in place.
// After calling this function, head should point to the
// last node of the original list.
// ============================================================
void reverse_list() {
    // TODO: Implement this function
    // Hint: Use three pointers - prev, current, next
}

// ============================================================
// EXERCISE 8: Delete by Value
// Write a function that deletes the FIRST occurrence of
// the given value from the list. Return 1 if deleted, 0 if not found.
// ============================================================
int delete_by_value(int value) {
    // TODO: Implement this function
    // Return 1 if deleted, 0 if value not found
    return 0;
}

// ============================================================
// EXERCISE 9: Remove Duplicates (Sorted List)
// Given a sorted linked list, remove all duplicate values
// so that each element appears only once.
// ============================================================
void remove_duplicates_sorted() {
    // TODO: Implement this function
    // Hint: Compare each node with its next node
}

// ============================================================
// EXERCISE 10: Find Middle Element
// Write a function that finds and returns the middle element.
// If list has even number of nodes, return the second middle.
// Return -1 if list is empty.
// Hint: Use two pointers - slow and fast
// ============================================================
int find_middle() {
    // TODO: Implement this function
    // Return middle element value, or -1 if empty
    return -1;
}

// ============================================================
// EXERCISE 11: Check if List is Sorted
// Write a function that checks if the list is sorted in
// ascending order. Return 1 if sorted, 0 if not sorted.
// ============================================================
int is_sorted() {
    // TODO: Implement this function
    // Return 1 if sorted in ascending order, 0 otherwise
    return 0;
}

// ============================================================
// EXERCISE 12: Insert in Sorted Order
// Given a sorted list, insert a new value in the correct
// position to maintain sorted order.
// ============================================================
void insert_sorted(int value) {
    // TODO: Implement this function
    // Insert value in correct position to keep list sorted
}

// ============================================================
// BONUS EXERCISE: Detect Cycle
// Write a function that detects if the linked list has a cycle.
// Return 1 if cycle exists, 0 otherwise.
// Hint: Use Floyd's cycle detection (slow and fast pointers)
// ============================================================
int has_cycle() {
    // TODO: Implement this function
    // Return 1 if cycle exists, 0 otherwise
    return 0;
}

// Clear the list (helper for testing)
void clear_list() {
    struct node *temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
}

int main() {
    int choice, value, pos, result;

    do {
        printf("\n===== LINKED LIST EXERCISES TEST MENU =====\n");
        printf("1. Add element to list\n");
        printf("2. Display list\n");
        printf("3. Clear list\n");
        printf("--- Exercise Tests ---\n");
        printf("4. Test count_nodes()\n");
        printf("5. Test sum_of_elements()\n");
        printf("6. Test find_max()\n");
        printf("7. Test find_min()\n");
        printf("8. Test search(value)\n");
        printf("9. Test get_nth_node(n)\n");
        printf("10. Test reverse_list()\n");
        printf("11. Test delete_by_value(value)\n");
        printf("12. Test remove_duplicates_sorted()\n");
        printf("13. Test find_middle()\n");
        printf("14. Test is_sorted()\n");
        printf("15. Test insert_sorted(value)\n");
        printf("0. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to add: ");
                scanf("%d", &value);
                append(value);
                display();
                break;
            case 2:
                display();
                break;
            case 3:
                clear_list();
                printf("List cleared.\n");
                break;
            case 4:
                printf("Node count: %d\n", count_nodes());
                break;
            case 5:
                printf("Sum of elements: %d\n", sum_of_elements());
                break;
            case 6:
                printf("Maximum value: %d\n", find_max());
                break;
            case 7:
                printf("Minimum value: %d\n", find_min());
                break;
            case 8:
                printf("Enter value to search: ");
                scanf("%d", &value);
                result = search(value);
                if (result == -1)
                    printf("Value not found.\n");
                else
                    printf("Found at position: %d\n", result);
                break;
            case 9:
                printf("Enter position (1-based): ");
                scanf("%d", &pos);
                result = get_nth_node(pos);
                if (result == -1)
                    printf("Invalid position.\n");
                else
                    printf("Value at position %d: %d\n", pos, result);
                break;
            case 10:
                reverse_list();
                printf("List reversed.\n");
                display();
                break;
            case 11:
                printf("Enter value to delete: ");
                scanf("%d", &value);
                if (delete_by_value(value))
                    printf("Value deleted.\n");
                else
                    printf("Value not found.\n");
                display();
                break;
            case 12:
                remove_duplicates_sorted();
                printf("Duplicates removed (assuming sorted list).\n");
                display();
                break;
            case 13:
                result = find_middle();
                if (result == -1)
                    printf("List is empty.\n");
                else
                    printf("Middle element: %d\n", result);
                break;
            case 14:
                if (is_sorted())
                    printf("List is sorted.\n");
                else
                    printf("List is NOT sorted.\n");
                break;
            case 15:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                insert_sorted(value);
                display();
                break;
            case 0:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    } while (choice != 0);

    clear_list();
    return 0;
}
