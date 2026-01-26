/*
 * Circular Linked List Implementation
 * Operations: Create, Insert (beginning, end, position), Delete (beginning, end, position), Display
 */

#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;
struct node *tail = NULL;
struct node *nw, *temp;

// Create a new node
struct node* create_node(int value) {
    nw = (struct node*)malloc(sizeof(struct node));
    nw->data = value;
    nw->next = NULL;
    return nw;
}

// Create initial circular list with n nodes
void create_list() {
    int n, value, i;
    printf("Enter number of nodes: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Enter value for node %d: ", i + 1);
        scanf("%d", &value);
        nw = create_node(value);

        if (head == NULL) {
            head = tail = nw;
            nw->next = head;  // Point to itself (circular)
        } else {
            tail->next = nw;
            nw->next = head;  // New node points back to head
            tail = nw;
        }
    }
    printf("Circular list created successfully!\n");
}

// Insert at beginning
void insert_beginning() {
    int value;
    printf("Enter value to insert: ");
    scanf("%d", &value);
    nw = create_node(value);

    if (head == NULL) {
        head = tail = nw;
        nw->next = head;
    } else {
        nw->next = head;
        head = nw;
        tail->next = head;  // Update tail to point to new head
    }
    printf("Node inserted at beginning.\n");
}

// Insert at end
void insert_end() {
    int value;
    printf("Enter value to insert: ");
    scanf("%d", &value);
    nw = create_node(value);

    if (head == NULL) {
        head = tail = nw;
        nw->next = head;
    } else {
        tail->next = nw;
        nw->next = head;  // New tail points to head
        tail = nw;
    }
    printf("Node inserted at end.\n");
}

// Insert at specific position
void insert_position() {
    int value, pos, i;
    printf("Enter position to insert (1-based): ");
    scanf("%d", &pos);

    if (pos == 1) {
        insert_beginning();
        return;
    }

    printf("Enter value to insert: ");
    scanf("%d", &value);
    nw = create_node(value);

    temp = head;
    for (i = 1; i < pos - 1 && temp->next != head; i++) {
        temp = temp->next;
    }

    if (i < pos - 1) {
        printf("Position out of range!\n");
        free(nw);
        return;
    }

    nw->next = temp->next;
    temp->next = nw;

    if (temp == tail) {
        tail = nw;
    }
    printf("Node inserted at position %d.\n", pos);
}

// Delete from beginning
void delete_beginning() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    temp = head;
    if (head == tail) {  // Only one node
        head = tail = NULL;
    } else {
        head = head->next;
        tail->next = head;
    }
    printf("Deleted value: %d\n", temp->data);
    free(temp);
}

// Delete from end
void delete_end() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    if (head == tail) {  // Only one node
        printf("Deleted value: %d\n", head->data);
        free(head);
        head = tail = NULL;
        return;
    }

    // Find second last node
    temp = head;
    while (temp->next != tail) {
        temp = temp->next;
    }

    printf("Deleted value: %d\n", tail->data);
    free(tail);
    tail = temp;
    tail->next = head;
}

// Delete from specific position
void delete_position() {
    int pos, i;
    struct node *prev;

    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    printf("Enter position to delete (1-based): ");
    scanf("%d", &pos);

    if (pos == 1) {
        delete_beginning();
        return;
    }

    temp = head;
    for (i = 1; i < pos && temp->next != head; i++) {
        prev = temp;
        temp = temp->next;
    }

    if (i < pos) {
        printf("Position out of range!\n");
        return;
    }

    if (temp == tail) {
        tail = prev;
    }

    prev->next = temp->next;
    printf("Deleted value: %d\n", temp->data);
    free(temp);
}

// Display the circular list
void display() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    printf("Circular List: ");
    temp = head;
    do {
        printf("%d", temp->data);
        temp = temp->next;
        if (temp != head) printf(" -> ");
    } while (temp != head);
    printf(" -> (back to head)\n");
}

// Count nodes
void count_nodes() {
    if (head == NULL) {
        printf("Total nodes: 0\n");
        return;
    }

    int count = 0;
    temp = head;
    do {
        count++;
        temp = temp->next;
    } while (temp != head);
    printf("Total nodes: %d\n", count);
}

// Search for a value
void search_value() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    int value, pos = 1, found = 0;
    printf("Enter value to search: ");
    scanf("%d", &value);

    temp = head;
    do {
        if (temp->data == value) {
            printf("Value %d found at position %d\n", value, pos);
            found = 1;
        }
        pos++;
        temp = temp->next;
    } while (temp != head);

    if (!found) {
        printf("Value %d not found in the list.\n", value);
    }
}

int main() {
    int choice;

    do {
        printf("\n===== CIRCULAR LINKED LIST MENU =====\n");
        printf("1. Create List\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert at End\n");
        printf("4. Insert at Position\n");
        printf("5. Delete from Beginning\n");
        printf("6. Delete from End\n");
        printf("7. Delete from Position\n");
        printf("8. Display List\n");
        printf("9. Count Nodes\n");
        printf("10. Search Value\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: create_list(); break;
            case 2: insert_beginning(); break;
            case 3: insert_end(); break;
            case 4: insert_position(); break;
            case 5: delete_beginning(); break;
            case 6: delete_end(); break;
            case 7: delete_position(); break;
            case 8: display(); break;
            case 9: count_nodes(); break;
            case 10: search_value(); break;
            case 0: printf("Exiting...\n"); break;
            default: printf("Invalid choice!\n");
        }
    } while (choice != 0);

    return 0;
}
