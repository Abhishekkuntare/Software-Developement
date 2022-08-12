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
        printf("%d-->", ptr->data);
        ptr = ptr->next;
    }
    printf("X");
}

struct node *delete (struct node *head)
{
    struct node *p = head;
    head = head->next;
    free(p);
    return head;
}

struct node *deleteindex(struct node *head, int index)
{
    struct node *p = head;
    struct node *q = head->next;
    for (int i = 0; i < index - 1; i++)
    {
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);
    return head;
}

struct node *deleteend(struct node *head)
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
{ // creating the pointer variables
    struct node *head;
    struct node *second;
    struct node *third;

    // allocates the dynamic memory
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    // Points to another node
    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = NULL;

    printf("Linked List: ");
    Display(head);

    // head = delete (head);
    // printf("\nAfter deletion List: ");
    // Display(head);

    // int index;
    // printf("\nEnter the Index: ");
    // scanf("%d", &index);

    // head = deleteindex(head, index);
    // printf("\nAfter deletion: ");
    // Display(head);

    head = deleteend(head);
    printf("\nAfter deletion: ");
    Display(head);
    return 0;
}