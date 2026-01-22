#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

struct node
{
    int data;
    struct node *next;
};
struct node *first_no, *second_no, *third_no, *head, *tail, *temp, *nw;

int main()
{
    int item;
    printf("Enter first number (end with -1):\n");
    scanf("%d", &item);
    first_no->data = item;
    first_no->next = second_no;

    printf("Enter second number (end with -1):\n");
    scanf("%d", &item);
    second_no->data = item;
    second_no->next = third_no;

    printf("Enter third number (end with -1):\n");
    scanf("%d", &item);
    third_no->data = item;
    third_no->next = NULL;

    head = first_no;
    tail = third_no;

    temp = head;
    while (temp != NULL)
    {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
    return 0;
}

// insertion at the beginning
void insert_at_beginning()
{
    int item;
    printf("Enter item to insert at beginning:\n");
    scanf("%d", &item);

    nw = (struct node *)malloc(sizeof(struct node));
    nw->data = item;
    nw->next = head;
    head = nw;
}

