
#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Display(struct node *head)
{
    struct node *ptr = head;
    do
    {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    } while (ptr != head);
}

struct node *insertAtEnd(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;
    struct node *p = head->next;

    while (p->next != head)
    {
        p = p->next;
    }
    // in that position p will be in last node

    p->next = ptr;
    ptr->next = head;
    return head;
}

int main()
{
    int item;
    struct node *head;
    struct node *second;
    struct node *third;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = head;

    printf("\nCircular LL: ");
    Display(head);

    printf("\nEnter the data: ");
    scanf("%d", &item);

    head = insertAtEnd(head, item);
    printf("After inserting: ");
    Display(head);
}