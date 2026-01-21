// Write a program to implement single linear linked list with the following operations
// i. Creation
// ii. Insertion at beginning
// iii. Insertion at middle
// iv. Insertion and end
// v. Deletion at begining
// vi. Deletion at middlle
// vii. Deletion at end
// viii.
// Display(head to rear)
// Answer
//implementation of linear linked list
//created on 15-08-2017
//created by M.Hamad
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
void creation(void);
void insert_beg(void);
void insert_end(void);
void insert_midd(void);
void delete_beg(void);
void delete_midd(void);
void delete_end(void);
void display(void);
struct node
{
    int data;
    struct node *next;
};struct node *nw,*head=NULL,*tail,*temp;
void main()
{
int choice;
creation();
do
{
printf("Select your Choice as:1.Insert at beginning 2.Insert at Middle 3.Insert at End 4.Delete at beginning 5.Delete at Middle 6.Delete 7.Display");
scanf("%d",&choice);
switch(choice)
{
case 1:
insert_beg();
break;
case 2:
insert_midd();break;
case 3:
insert_end();
break;
case 4:
delete_beg();
break;
case 5:
delete_midd();
break;
case 6:
delete_end();
break;
case 7:
display();
break;
}
}while(choice<=7);
}
void creation()
{
    int n,i,item;
    printf("Enter the number of nodes: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        nw=(struct node*)malloc(sizeof(struct node));
        nw->next=NULL;
        printf("Enter the item: ");
        scanf("%d",&item);
        if(head==NULL)
        {
            nw->data=item;
            head=nw;
            tail=nw;
        }
        else
        {
            nw->data=item;
            tail->next=nw;
            tail=nw;
        }
    }
}
void insert_beg()
{
int item;
printf("Enter the item: ");
scanf("%d",&item);
nw=(struct node*)malloc(sizeof(struct node));
nw->data=item;
nw->next=head;
head=nw;
}
void insert_end()
{
int item;
printf("Enter the item: ");
scanf("%d",&item);
nw=(struct node*)malloc(sizeof(struct node));
nw->data=item;
nw->next=NULL;
tail->next=nw;
tail=nw;
}
void insert_midd()
{
int item;
printf("Enter the item: ");
scanf("%d",&item);
struct node *temp1,*temp2;
int pos;
printf("Enter the Position: ");
scanf("%d",&pos);
temp1=head;
for(int i=0;i<pos-2;i++)
temp1=temp1->next;
temp2=temp1->next;
nw=(struct node*)malloc(sizeof(struct node));
nw->data=item;
temp1->next=nw;
nw->next=temp2;
}
void delete_beg()
{
temp=head;
head=head->next;
printf("The deleted item is %d",temp->data);
free(temp);
}
void delete_end()
{
temp=head;
while(temp->next!=NULL)
{
tail=temp;
temp=temp->next;
}
tail->next=NULL;
printf("The deleted item is %d",temp->data);
free(temp->next);
}void delete_midd()
{
struct node* temp2;
temp=head;
int i, pos;
printf("Enter the Position: ");
scanf("%d",&pos);
for(i=0;i<pos-2;i++)
{
temp=temp->next;
}
temp2=temp->next;
temp->next=temp2->next;
printf("The deleted item is %d",temp2->data);
temp2->next=NULL;
free(temp2);
}
void display()
{
temp=head;
printf("\nList contains\n");
while(temp!=NULL)
{
printf("%d\n",temp->data);
temp=temp->next;
}
}