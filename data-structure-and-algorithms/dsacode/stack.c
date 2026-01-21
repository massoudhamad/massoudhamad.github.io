#include<stdio.h>
#include<stdlib.h>
#define SIZE 30

int stack[SIZE],top=-1;

void push(int value);
int pop();
int peek();
void display();


int main(){
	int choice=1,value;
	while (choice==1){
		printf("\n 1. Push operation\n");
		printf("\n 2. Pop operation\n");
		printf("\n 3. Peek operation\n");
		printf("\n 4. Display operation\n");
		scanf("%d",&choice);

		switch(choice){
			case 1: 
			printf("\nEnter the data you want to add\n");
			scanf("%d",&value);
		 	push(value);
			break;
			
			case 2:
			value=pop();
			if(value!=-1) 
			printf("\nDeleted the data is %d::\n",value);
			break;
			
			case 3:
			value=peek();
			if(value!=-1) 
			printf("\nPeek value is::%d\n",value);
			break;
						
			case 4: 
			display();
			break;
		}
		printf("Do You to carry on ? (1/0)\n");
		scanf("\n%d",&choice);
	}
	return 0;
}




void push( int value){
	if (top==SIZE-1){
		printf("\n stack is full");
	}
	else{
		top++;
		stack[top]=value;
	}
}


int pop(){
	int value;
	if(top==-1){
		printf("\nstack is empty\n");
		return -1;
	}
	else{
		stack[top]=value;
		top--;
	}
	return value;
}

int peek(){
	if(top==-1){
		printf("\nstack is empty\n");
		return -1;
	}else{
		return stack[top];
	}
}

void display(){
	int i;
	if(top==-1){
		printf("\nstack is empty\n");
	}
	else{
		for(i=top;i>=0;i--){
			printf("\n%d",stack[i]);
			printf("\n");
		}
	}
}