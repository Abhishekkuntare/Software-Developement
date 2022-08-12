#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Traversal(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("%d-->", ptr->data);
        ptr = ptr->next;
    }
    printf("NULL");
}

int searchElement(struct node *head, int item)
{
    struct node *ptr = head;

    int index = 0;
    while (ptr != NULL)
    {
        if (ptr->data == item)
        {
            return index;
        }
        ptr = ptr->next;
        index++;
    }
    return -1;
}

int main()
{
    int item;
    int index;
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    head->data = 11;
    head->next = second;

    second->data = 23;
    second->next = third;

    third->data = 54;
    third->next = fourth;

    fourth->data = 7;
    fourth->next = NULL;

    printf("Linked list: ");
    Traversal(head);

    printf("\nSearch number: ");
    scanf("%d", &item);

    index = searchElement(head, item);

    if (index == -1)
    {
        printf("Item not Found!");
    }
    else
    {
        printf("Item found in %d index", index + 1);
    }
    return 0;
}