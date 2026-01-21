#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define SIZE 50

void expression_conv();
int checkspace(char charc);
void push(long int charc);
int pop();
int priority(char charc);
int isEmpty();

int top;
long int stack[SIZE];
char infix[SIZE], postfix[SIZE];

int main()
{
    top = -1;
    printf("\nEnter the infix expression:\t");
    scanf("%[^\n]s", infix);
    expression_conv();
    printf("\nExpression in postfix format::\t%s\n", postfix);
    return 0;
}

void expression_conv()
{
    int count, temp = 0;
    char next, charc;
    for (count = 0; count < strlen(infix); count++)
    {
        charc = infix[count];
        if (!checkspace(charc))
        {
            switch (charc)
            {
            case '(':
                push(charc);
                break;
            case ')':
                while (next = pop() != '(')
                {
                    postfix[temp++] = next;
                }
                break;
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
            case '^':
                while (!isEmpty() && priority(stack[top]) >= priority(charc))
                    postfix[temp++] = pop();
                push(charc);
                break;
            default:
                postfix[temp++] = charc;
            }
        }
    }
    while (!isEmpty())
    {
        postfix[temp++] = pop();
    }
    postfix[temp] = '\0';
}

int priority(char charc)
{
    switch (charc)
    {
    case '(':
        return 0;
    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
    case '%':
        return 2;
    case '^':
        return 3;
    default:
        return 0;
    }
}

void push(long int charc)
{
    if (top > SIZE)
    {
        printf("Stack overflow");
        exit(1);
    }
    top = top + 1;
    stack[top] = charc;
}

int checkspace(char charc)
{
    if (charc == ' ' || charc == '\t')
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int pop()
{
    if (isEmpty())
    {
        printf("stack underflow");
        exit(1);
    }
    return (stack[top--]);
}
int isEmpty()
{
    if (top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}