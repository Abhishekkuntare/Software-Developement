#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Traversal(struct node *start)
{
    while (start != NULL)
    {
        printf("%d-->", start->data);
        start = start->next;
    }
    printf("NULL");
}

int Search(struct node *ptr, int item)
{
    int index = 0;
    struct node *start = ptr;
    while (start != NULL)
    {
        if (start->data == item)
        {
            return index;
        }
        start = start->next;
        index++;
    }
    return -1;
}

int main()
{
    struct node *head, *se, *th, *fo;
    int item;
    head = (struct node *)malloc(sizeof(struct node));
    se = (struct node *)malloc(sizeof(struct node));
    th = (struct node *)malloc(sizeof(struct node));
    fo = (struct node *)malloc(sizeof(struct node));

    head->data = 10;
    head->next = se;

    se->data = 20;
    se->next = th;

    th->data = 30;
    th->next = fo;

    fo->data = 40;
    fo->next = NULL;

    Traversal(head);
    printf("\nItem: ");
    scanf("%d", &item);

    int ans = Search(head, item);
    if (ans == -1)
        printf("Element does not exits!");
    else
        printf("Item found at: %d", ans);

    return 0;
}