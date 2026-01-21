#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h> 


struct node
{
    int data;
    struct node *next;
};struct node *first_no,*second_no,*third_no,*head,*tail,*temp;

void main()
{
    int item;
    
    printf("Enter first item: ");
    scanf("%d",&item);
    first_no->data=item;
    first_no->next=second_no;

    printf("Enter Second item: ");
    scanf("%d",&item);
    second_no->data=item;
    second_no->next=third_no;

    printf("Enter Third item: ");
    scanf("%d",&item);
    third_no->data=item;
    third_no->next=NULL;

    head=first_no;tail=third_no;

    temp=head;
    while(temp != NULL)
    {
        printf("%d",temp->data);
        temp=temp->next;
    }

}
