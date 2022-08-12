#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *start = NULL;

int main()
{
    int count;
    char ch;
    struct node *new_node, *current;

    do
    {
        new_node = (struct node *)malloc(sizeof(struct node));
        printf("\nEnter data: ");
        scanf("%d", &new_node->data);
        new_node->next = NULL;

        if (start == NULL)
        {
            start = new_node;
            current = new_node;
        }
        else
        {
            current->next = new_node;
            current = new_node;
        }

        printf("\nDo you want to create another node? ");
        scanf("%s", &ch);
    } while (ch != 'n');

    printf("\nLinked list: ");
    while (start != NULL)
    {
        printf("%d-->", start->data);
        start = start->next;
        count++;
    }
    printf("NULL");
    printf("\nNo of nodes: %d", count);

    return 0;
}