#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *start = NULL;

void insert(int data)
{
    struct node *new_node = (struct node *)malloc(sizeof(struct node *));
    new_node->data = data;
    new_node->next = start;
    start = new_node;
}

void display()
{
    int count = 0;
    struct node *new_node;
    new_node = start;

    while (new_node != NULL)
    {
        printf("%d-->", new_node->data);
        new_node = new_node->next;
        count++;
    }
    printf("\nlength: %d", count);
}

void delete (int index)
{

    struct node *new_node;
    struct node *p = start;

    if (index == 1)
    {
        start = p->next;
        free(p);
    }
    else
    {
        struct node *q = start->next;

        for (int i = 1; i < index - 1; i++)
        {
            p = p->next;
            q = q->next;
        }
        p->next = q->next;
        free(q);
    }
}

int main()
{
    int index;
    insert(10);
    insert(20);
    insert(30);
    insert(40);

    printf("\nLinked list: ");
    display();

    printf("\nIndex: ");
    scanf("%d", &index);

    delete (index);
    printf("\nAfter deletion: ");
    display();
    return 0;
}