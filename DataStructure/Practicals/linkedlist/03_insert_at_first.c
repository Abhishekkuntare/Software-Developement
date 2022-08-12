#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *start = NULL;
void Trversal(struct node *start)
{
    while (start != NULL)
    {
        printf("%d-->", start->data);
        start = start->next;
    }
    printf("NULL");
}

struct node *insertAtFirst(struct node *head, int item)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = item;
    ptr->next = head;
    head = ptr;
    return ptr;
}

struct node *insert_at_index(struct node *head, int item, int index)
{
    struct node *new_node = (struct node *)malloc(sizeof(struct node));
    struct node *prev_node = head;
    int i = 0;
    while (i != index - 1)
    {
        prev_node = prev_node->next;
        i++;
    }
    new_node->data = item;
    new_node->next = prev_node->next;
    prev_node->next = new_node;
    return head;
}

void insert()
{
    int n;
    struct node *new_node = (struct node *)malloc(sizeof(struct node));
    printf("\nEnter the data: ");
    scanf("%d", &new_node->data);
    new_node->next = NULL;

    printf("\nEnter the index: ");
    scanf("%d", &n);
    if (n == 1)
    {
        new_node->next = start;
        start = new_node;
    }
    else
    {
        struct node *p;
        for (int i = 0; i < n; i++)
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
    // struct node *head, *se, *th;
    // head = (struct node *)malloc(sizeof(struct node));
    // se = (struct node *)malloc(sizeof(struct node));
    // th = (struct node *)malloc(sizeof(struct node));

    // head->data = 199;
    // head->next = se;

    // se->data = 299;
    // se->next = th;

    // th->data = 399;
    // th->next = NULL;

    // Trversal(head);
    // int item;
    // printf("\nEnter the item: ");
    // scanf("%d", &item);
    // int index;
    // printf("\nEnter the index: ");
    // scanf("%d", &index);

    // // head = insertAtFirst(head, item);
    // // printf("after insertion: ");
    // // Trversal(head);

    // head = insert_at_index(head, item, index);
    // Trversal(head);
    // return 0;
    char ch;
    do
    {
        insert();
        display();
        printf("\nDo you want to create another node: ");
        scanf("%s", &ch);
    } while (ch != 'n');
    printf("\nLinked list: ");
    display();
    return 0;
}