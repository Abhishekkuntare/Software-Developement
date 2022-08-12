#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

// creating the funtion for printing the LIst
void Display(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
}

struct node *DeleteFirstNode(struct node *head)
{
    struct node *ptr = head;
    head = head->next;
    free(ptr);
    return head;
}
int main()
{
    // creating the pointer variables
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

    // how many times we call the function it will be deleted the node that times
    head = DeleteFirstNode(head);
    printf("\nAfter deletion: ");
    Display(head);
    return 0;
}