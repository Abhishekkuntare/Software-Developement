#include <stdio.h>
#include <stdlib.h>

// creating the custom data type
struct node
{
    int data;
    struct node *next;
};

// initialize start with null
struct node *start = NULL;

int main()
{
    int count;
    char ch;
    struct node *new_node, *current;
    do
    {
        // create a 8 bytes empty node dinamically
        new_node = (struct node *)malloc(sizeof(struct node));

        printf("\nPlease enter the data: ");
        scanf("%d", &new_node->data);
        new_node->next = NULL;

        // check the condition if start is null
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

        printf("\nDo you want to create another node?: ");
        // ch = getche(); // for read the value from user
        scanf("%s", &ch);
    } while (ch != 'n');

    printf("\nThe Linked List: ");

    while (start != NULL)
    {
        printf("%d-->", start->data);
        start = start->next;
        count++;
    }
    printf("NULL");
    printf("\nNo. of Nodes: %d", count);

    return 0;
}
