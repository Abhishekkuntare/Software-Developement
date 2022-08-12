#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Display(struct node *head)
{
    while (head != NULL)
    {
        printf("%d-->", head->data);
        head = head->next;
    }
    printf("NULL");
}

struct node *Insertion(struct node *head, int data)
{
    struct node *ptr;
    ptr = (struct node *)malloc(sizeof(struct node));

    ptr->next = head;
    ptr->data = data;
    return ptr;
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
    third->next = NULL;

    printf("Linked List: ");
    Display(head);

    printf("\nInsert item: ");
    scanf("%d", &item);

    head = Insertion(head, item);

    printf("After insertion: ");
    Display(head);

    return 0;
}