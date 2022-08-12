#include <stdio.h>
#include <stdlib.h>

#define MAX 3 // Define global variable
int queue[MAX], front = -1, rear = -1;

int isOverflow()
{
    if (rear == MAX - 1)
    {
        return 1;
    }
    return 0;
}
int isUnderflow()
{
    if (front == -1)
    {
        return 1;
    }
    return 0;
}

// inserting in the queue
void enqueue(int data)
{
    if (isOverflow(queue))
    {
        printf("Queue is Overflow!\n");
    }
    else
    {
        rear++;
        queue[rear] = data;
        if (front == -1)
        {
            front = 0;
        }
    }
}

void display()
{
    printf("The Enqueue Queue: ");
    if (isUnderflow(queue))
    {
        printf("Queue is Underflow!\n");
    }
    else
    {
        for (int i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
    }
}

int main()
{

    int size, data;
    printf("Enter the size of Queue: ");
    scanf("%d", &size);

    for (int i = 0; i < size; i++)
    {
        printf("Enter the Queue data: ");
        scanf("%d", &data);
        enqueue(data);
    }
    display();

    return 0;
}
