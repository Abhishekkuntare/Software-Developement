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

struct node *InsertAfterNode(struct node *head, int data, struct node *prev_node)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;

    ptr->next = prev_node->next;
    prev_node->next = ptr;
    return head;
}

int main()
{
    int item;
    // create a pointer variables with own data type
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    // Allocates a dynamic memory
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    // points to another node
    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = fourth;

    fourth->data = 40;
    fourth->next = NULL;

    printf("Linked list: ");
    Display(head);

    printf("\nInsert item: ");
    scanf("%d", &item);

    printf("After inserting list: ");
    head = InsertAfterNode(head, item, third);

    Display(head);

    return 0;
}