
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

struct node *insertAtPosition(struct node *head, int data, int position)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));

    struct node *p = head;

    int i = 0;
    while (i < position - 1)
    {
        ptr = ptr->next;
        p = p->next;
        i++;
    }
    ptr->next = p->next;
    p->next = ptr;
    ptr->data = data;
    return head;
}

int main()
{
    int item;
    int position;
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

    printf("\nEnter the index: ");
    scanf("%d", &position);

    head = insertAtPosition(head, item, position);
    printf("After inserting: ");
    Display(head);
}