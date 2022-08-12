
// #include <stdio.h>

// #define MAX 5
// int stack[MAX],top = -1;  //Global variable

// void push(int item)
// {
//     if (top == MAX - 1)
//     {
//         printf("Stack is Overflow!");
//         return;
//     }
//     else
//     {
//         top++;
//         stack[top] = item;
//         printf("%d is pushed on the stack !", item);
//     }
// }

// void pop()
// {
//     int item;
//     if (top == -1)
//     {
//         printf("Stack is Underflow!");
//         return;
//     }
//     else
//     {
//         item = stack[top];
//         top--;
//         printf("%d is poped on the stack !", item);
//     }
// }

// void display()
// {

//     int i;
//     for (i = top; i >= 0; i--)
//     {
//         printf("%d ", stack[i]);
//     }
// }
// int main()
// {

//     int choice, item;
//     char ch;

//     do
//     {
//         printf("\nPress 1 for Push");
//         printf("\nPress 2 for Pop");
//         printf("\nPress 3 for Show");

//         printf("\nEnter your choice: ");
//         scanf("%d", &choice);

//         switch (choice)
//         {
//         case 1:
//             printf("\nEnter item: ");
//             scanf("%d", &item);
//             push(item);
//             break;

//         case 2:
//             pop();
//             break;
//         case 3:
//             display();
//             break;

//         default:
//             printf("\nInvalid Input!");
//             break;
//         }
//         printf("\nDo you want to continue?: ");
//         scanf("%s", &ch);

//     } while (ch == 'y' || ch != 'n');
//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>

#define MAX 5
int stack[MAX], top = -1;

int isOverflow()
{
    if (top == MAX - 1)
    {
        return -1;
    }
    return 0;
}
int isUnderflow()
{
    if (top == -1)
    {
        return -1;
    }
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
        printf("%d is push on the stack!", item);
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
        printf("%d is poped on the stack!", item);
    }
}

void display()
{
    for (int i = top; i >= 0; i--)
    {
        printf("%d ", stack[i]);
    }
}

int main()
{
    int choice, item;
    char ch;
    do
    {
        printf("\nPress 1 for push");
        printf("\nPress 2 for pop");
        printf("\nPress 3 for show");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Enter item: ");
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
            printf("Invalid Input!");
            break;
        }
        printf("\nDo you want to continue y/n: ");
        scanf("%s", &ch);
    } while (ch == 'y' || ch != 'n');

    return 0;
}