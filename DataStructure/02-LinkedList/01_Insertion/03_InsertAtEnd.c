#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

// creating a function for display
void Display(struct node *ptr)
{

    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->next; // increments the pointer
    }
}

struct node *InsertAtEnd(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;
    struct node *p = head; // now p is head;

    while (p->next != NULL)
    {
        p = p->next;
    }
    p->next = ptr;
    ptr->next = NULL;
    return head;
}

int main()
{

    int item;
    // create a pointer variables with own data type
    struct node *head;
    struct node *second;
    struct node *third;

    // Allocates a dynamic memory
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    // points to another node
    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = NULL;

    printf("Linked list: ");
    Display(head);

    printf("\nInsert Item: ");
    scanf("%d", &item);

    printf("After inserting: ");
    head = InsertAtEnd(head, item);
    Display(head);

    return 0;
}