// #include <stdio.h>
// #include <stdlib.h>
// #define MAX 50 // defining the size of queue
// int queue[MAX], front = -1, rear = -1;

// void enqueue(int data) // function to enqueue data
// {
//     if (rear == MAX - 1)
//         printf("\nQueue is Full!");
//     else
//     {
//         rear = rear + 1;
//         queue[rear] = data;
//         if (front == -1)
//             front = 0;
//     }
// }
// void disp() // function to display the relents of the queue
// {
//     printf("\nThe elements in the queue are:");
//     int i;
//     if (front == -1)
//         printf("\nQueue is Empty");
//     else
//         for (i = front; i <= rear; i++)
//         {

//             printf("%d ", queue[i]);
//         }
//     printf("\n");
// }
// void dequeue() // function to delete elements from the queue
// {
//     if (front == -1 || front == rear + 1)
//         printf("\nQueue is Empty");
//     else
//     {
//         queue[front] = 0;
//         front = front + 1;
//     }
//     disp();
// }
// int main() // main function for all input and output statements
// {
//     int data, size;
//     printf("Enter the size of queue: ");
//     scanf("%d", &size);
//     printf("\nEnter Data to Enqueue:\n");
//     for (int i = 0; i < size; i++)
//     {
//         scanf("%d", &data);
//         enqueue(data);
//     }
//     disp();
//     printf("Dequeuing elements:");

//     dequeue();

//     // for(int i=0;i<size;i++)
//     // {
//     //     dequeue();
//     // }
// }

#include <stdio.h>
#include <stdlib.h>

#define MAX 10
int queue[MAX], front = -1, rear = -1;

int isFull()
{
    if (rear == MAX - 1)
    {
        return 1;
    }
    return 0;
}
int isEmpty()
{
    if (front == -1 || front == rear + 1)
    {
        return 1;
    }
    return 0;
}

void enqueue(int data)
{
    if (isFull(queue))
    {
        printf("Queue is Full!");
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

void dequeue()
{
    if (isEmpty(queue))
    {
        printf("Queue is Empty!");
    }
    else
    {
        queue[front] = 0;
        front++;
    }
}

void display()
{
    printf("Queue Elements: ");
    if (isEmpty(queue))
    {
        printf("Queue is Empty!");
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
    printf("Enter the size of queue: ");
    scanf("%d", &size);

    for (int i = 0; i < size; i++)
    {
        printf("Enter the Queue data: ");
        scanf("%d", &data);
        enqueue(data);
    }
    display();
    printf("\nAfter Dequeing elements:\n");
    dequeue();
    display();

    return 0;
}