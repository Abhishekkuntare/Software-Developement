#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *start = NULL;

void insert()
{
    int n;
    struct node *new_node;
    new_node = (struct node *)malloc(sizeof(struct node *));

    printf("\nEnter the data: ");
    scanf("%d", &new_node->data);
    new_node->next = NULL;

    printf("\nEnter the position: ");
    scanf("%d", &n);

    if (n == 1)
    {
        new_node->next = start;
        start = new_node;
    }
    else
    {
        struct node *p = start;
        for (int i = 1; i < n - 1; i++)
        {
            p = p->next;
        }
        new_node->next = p->next;
        p->next = new_node;
    }
}

void display()
{

    struct node *new_node;
    new_node = start;
    while (new_node != NULL)
    {
        printf("%d-->", new_node->data);
        new_node = new_node->next;
    }
    printf("NULL");
}

int main()
{
    char ch;
    do
    {
        insert();
        display();
        printf("\nDo you want to create another node: ");
        ch = getche();
    } while (ch != 'n');
    printf("\nLinked list: ");
    display();
    return 0;
}