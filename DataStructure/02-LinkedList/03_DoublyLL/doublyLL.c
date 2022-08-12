

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *start = NULL;

void insert()
{
    int n;
    struct node *new_node;
    new_node = (struct node *)malloc(sizeof(struct node *));
    printf("\nEnter the data: ");
    scanf("%d", &n);

    new_node->data = n;
    new_node->next = NULL;
    new_node->prev = NULL;

    if (start == NULL)
    {
        start = new_node;
    }
    else
    {
        start->prev = new_node;
        new_node->next = start;
        start = new_node;
    }
}

void forwardDisplay()
{
    struct node *new_node;
    new_node = start;
    printf("\nForward Linked list: ");
    while (new_node != NULL)
    {
        printf("%d-->", new_node->data);
        new_node = new_node->next;
    }
    printf("NULL");
}

void reverseDisplay()
{
    struct node *new_node;
    new_node = start;

    if (start == NULL)
    {
        return;
    }
    while (new_node->next != NULL)
    {
        new_node = new_node->next;
    }

    printf("\nReverse Linked list: ");
    while (new_node != NULL)
    {
        printf("%d-->", new_node->data);
        new_node = new_node->prev;
    }
    printf("NULL");
    printf("\n");
}

int main()
{
    char ch;
    do
    {
        insert();
        forwardDisplay();
        reverseDisplay();

        printf("\nDo you want to continue: ");
        ch = getche();
    } while (ch != 'n');
    return 0;
}