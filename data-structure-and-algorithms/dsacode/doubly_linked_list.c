/*
 * Doubly Linked List Implementation
 * Operations: Create, Insert (beginning, middle, end), Delete (beginning, middle, end), Display (forward/backward)
 */

#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *prev;
    struct node *next;
};

struct node *head = NULL;
struct node *tail = NULL;
struct node *nw, *temp;

// Create a new node
struct node* create_node(int value) {
    nw = (struct node*)malloc(sizeof(struct node));
    nw->data = value;
    nw->prev = NULL;
    nw->next = NULL;
    return nw;
}

// Create initial list with n nodes
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
        } else {
            tail->next = nw;
            nw->prev = tail;
            tail = nw;
        }
    }
    printf("List created successfully!\n");
}

// Insert at beginning
void insert_beginning() {
    int value;
    printf("Enter value to insert: ");
    scanf("%d", &value);
    nw = create_node(value);

    if (head == NULL) {
        head = tail = nw;
    } else {
        nw->next = head;
        head->prev = nw;
        head = nw;
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
    } else {
        tail->next = nw;
        nw->prev = tail;
        tail = nw;
    }
    printf("Node inserted at end.\n");
}

// Insert at specific position
void insert_middle() {
    int value, pos, i;
    printf("Enter position to insert (1-based): ");
    scanf("%d", &pos);
    printf("Enter value to insert: ");
    scanf("%d", &value);

    if (pos == 1) {
        insert_beginning();
        return;
    }

    nw = create_node(value);
    temp = head;

    for (i = 1; i < pos - 1 && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Position out of range!\n");
        free(nw);
        return;
    }

    if (temp->next == NULL) {
        temp->next = nw;
        nw->prev = temp;
        tail = nw;
    } else {
        nw->next = temp->next;
        nw->prev = temp;
        temp->next->prev = nw;
        temp->next = nw;
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
    if (head == tail) {
        head = tail = NULL;
    } else {
        head = head->next;
        head->prev = NULL;
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

    temp = tail;
    if (head == tail) {
        head = tail = NULL;
    } else {
        tail = tail->prev;
        tail->next = NULL;
    }
    printf("Deleted value: %d\n", temp->data);
    free(temp);
}

// Delete from specific position
void delete_middle() {
    int pos, i;

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
    for (i = 1; i < pos && temp != NULL; i++) {
        temp = temp->next;
    }

    if (temp == NULL) {
        printf("Position out of range!\n");
        return;
    }

    if (temp == tail) {
        delete_end();
        return;
    }

    temp->prev->next = temp->next;
    temp->next->prev = temp->prev;
    printf("Deleted value: %d\n", temp->data);
    free(temp);
}

// Display list forward (head to tail)
void display_forward() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }

    printf("List (forward): ");
    temp = head;
    while (temp != NULL) {
        printf("%d", temp->data);
        if (temp->next != NULL) printf(" <-> ");
        temp = temp->next;
    }
    printf("\n");
}

// Display list backward (tail to head)
void display_backward() {
    if (tail == NULL) {
        printf("List is empty!\n");
        return;
    }

    printf("List (backward): ");
    temp = tail;
    while (temp != NULL) {
        printf("%d", temp->data);
        if (temp->prev != NULL) printf(" <-> ");
        temp = temp->prev;
    }
    printf("\n");
}

// Count nodes in list
void count_nodes() {
    int count = 0;
    temp = head;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    printf("Total nodes: %d\n", count);
}

// Search for a value
void search_value() {
    int value, pos = 1, found = 0;
    printf("Enter value to search: ");
    scanf("%d", &value);

    temp = head;
    while (temp != NULL) {
        if (temp->data == value) {
            printf("Value %d found at position %d\n", value, pos);
            found = 1;
        }
        pos++;
        temp = temp->next;
    }

    if (!found) {
        printf("Value %d not found in the list.\n", value);
    }
}

int main() {
    int choice;

    do {
        printf("\n===== DOUBLY LINKED LIST MENU =====\n");
        printf("1. Create List\n");
        printf("2. Insert at Beginning\n");
        printf("3. Insert at End\n");
        printf("4. Insert at Position\n");
        printf("5. Delete from Beginning\n");
        printf("6. Delete from End\n");
        printf("7. Delete from Position\n");
        printf("8. Display Forward\n");
        printf("9. Display Backward\n");
        printf("10. Count Nodes\n");
        printf("11. Search Value\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: create_list(); break;
            case 2: insert_beginning(); break;
            case 3: insert_end(); break;
            case 4: insert_middle(); break;
            case 5: delete_beginning(); break;
            case 6: delete_end(); break;
            case 7: delete_middle(); break;
            case 8: display_forward(); break;
            case 9: display_backward(); break;
            case 10: count_nodes(); break;
            case 11: search_value(); break;
            case 0: printf("Exiting...\n"); break;
            default: printf("Invalid choice!\n");
        }
    } while (choice != 0);

    return 0;
}
