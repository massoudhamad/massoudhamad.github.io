#include<stdio.h>
#include<stdlib.h>
#define MAX 10
#define null 9999
struct stack
{
    int a[MAX];
    int top;
}s;
void initialize()
{
    s.top=-1;
}
void push(int item)
{
    if(isstackfull())
    {
        printf("stack is full\n");
        return;
    }
    s.top++; // for pushing the 1 st element, ‘top’ will be incremented to 0 and in that location 1 st element
    s.a[s.top]=item; // gets pushed in
}
int pop()
{
    int item;
    if(isstackempty())
        return null;
    // if stack is empty, an uncommon integer such as 9999 defined by null is
    item=s.a[s.top];
    // returned to indicate the ‘underflow’ state
    s.top--;
    // else element from the top most position is popped and top is decremented to
    return item;
    // point to the next location
}
int peek()
{
    int item;
    if(isstackempty())
        return null;
    item=s.a[s.top];
    return item;
}
int isstackempty()
{
    if(s.top== -1) // if there is no element in the stack, then top will be -1
    return 1;
    else
    return 0;
}
int isstackfull()
{
    if(s.top==MAX-1) // if top value =9 it means that all the locations in the array have been already filled
    return 1; // and so there is no room for new elements to be pushed
    else
    return 0;
}
int stackcount()
{
    int i;
    for(i=0;i<=s.top;i++);
    return i;
}
void display()
{
    int j;
    for(j=0;j<=s.top;j++)
    printf("%d ",s.a[j]);
    printf("\n");
}
int main()
{
    int item,choice;
    initialize();
    printf("enter the item to be inserted\n");
    scanf("%d",&item);
    push(item);
    do
    {
        printf("do you want to continue 1-push 2-pop 3-display 4-peek 5-stackcount 6-exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            printf("enter the item to be pushed\n");
            scanf("%d",&item);
            push(item);
            break;
            case 2:
            item=pop();
            if (item==null)
            printf("the stack is empty\n");
            else
            printf("the deleted item is %d\n",item);
            break;
            case 3:
            display();
            break;
            case 4: item=peek();
            if(item==null)
            printf("the stack is empty\n");
            else
            printf("the item at the top is %d\n",item);
            break;
            case 5: printf(" the number of elements in the stack is %d \n",stackcount());
            break;
            case 6:
            exit(0);
            default: break;
        }
    }while(choice!=6);
    system("pause");
    return 0;
}