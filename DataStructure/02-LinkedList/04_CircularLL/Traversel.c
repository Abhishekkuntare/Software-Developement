#include <stdio.h>
#include <stdlib.h>

struct node
{

    int data;
    struct node *next;
};

void Trversal(struct node *head)
{
    struct node *ptr = head;

    // printf("%d-->", ptr->data);
    // ptr = ptr->next;

    do
    {
        printf("%d-->", ptr->data);
        ptr = ptr->next;
    } while (ptr != head);
}

int main()
{

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

    Trversal(head);

    return 0;
}