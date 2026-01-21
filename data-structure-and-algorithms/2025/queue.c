// Queue using array
#include <stdio.h>
#define MAX 20

struct queue
{
    int q[MAX];
    int front, rear;
} qu;

void init()
{
    qu.front = qu.rear = -1;
}

void enqueue(int data)
{
    qu.rear++;
    if (qu.rear == MAX)
    {
        printf("Queue Overflow\n");
        return;
    }
    qu.q[qu.rear] = data;
}
int dequeue()
{
    if (qu.front == qu.rear)
    {
        printf("Queue Underflow\n");
        return -1;
    }
    qu.front++;
    return qu.q[qu.front];
}
void display()
{
    int i;
    for (i = qu.front + 1; i <= qu.rear; i++)
        printf("%d ", qu.q[i]);
    printf("\n");
}

int main()
{
    int data, choice;
    init();
    printf("enter the items to be added to queue\n");
    scanf("%d", &data);
    enqueue(data);
    do
    {
        printf("do you want to continue 1-enqueue 2-dequeue 3-display 4-exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("enter the items to be added to queue\n");
            scanf("%d", &data);
            enqueue(data);
            break;
        case 2:
            data = dequeue();
            if (data != -1)
                printf("Dequeued: %d\n", data);
            break;
        case 3:
            display();
            break;
        case 4:
            printf("Exiting...\n");
            break;
        default:
            printf("Invalid choice\n");
        }
    } while (choice != 4);
    return 0;
}