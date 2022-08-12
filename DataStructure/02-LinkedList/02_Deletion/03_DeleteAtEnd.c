#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Display(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
}

struct node *DeleteAtEnd(struct node *head)
{
    struct node *p = head;
    struct node *q = head->next;

    while (q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}

int main()
{

    // creating the pointer variables
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    // allocates the dynamic memory
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    // Points to another node
    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = fourth;

    fourth->data = 4;
    fourth->next = NULL;

    printf("Linked List: ");
    Display(head);

    head = DeleteAtEnd(head);
    printf("\nAfter deletion: ");
    Display(head);
    return 0;
}
