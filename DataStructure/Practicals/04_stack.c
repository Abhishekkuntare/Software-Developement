#include <stdio.h>
#define MAX 5
int stack[MAX], top = -1;

int isOverflow()
{
    if (top == MAX - 1)
        return -1;
    return 0;
}
int isUnderflow()
{
    if (top == -1)
        return -1;
    return 0;
}

void push(int item)
{
    if (isOverflow(stack))
    {
        printf("Stack is Overflow!");
    }
    else
    {
        top++;
        stack[top] = item;
        printf("%d is pushed on stack!", item);
    }
}
void pop()
{
    int item;
    if (isUnderflow(stack))
    {
        printf("Stack is Underflow!");
    }
    else
    {
        item = stack[top];
        top--;
        printf("%d is poped out the stack!", item);
    }
}
void display()
{
    if (isUnderflow(stack))
    {
        printf("Nothing to seen!");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            printf("%d ", stack[i]);
        }
    }
}

int main()
{
    int choice, item;
    char ch;
    do
    {
        printf("\nPress 1 for PUSH\nPress 2 for POP\nPress 3 for Display");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("\nEnter item: ");
            scanf("%d", &item);
            push(item);
            break;

        case 2:
            pop();
            break;
        case 3:
            display();
            break;

        default:
            printf("\nInvalid input!");
        }
        printf("\nDo you want to continue (y/n): ");
        scanf("%s", &ch);
    } while (ch != 'n');
    return 0;
}