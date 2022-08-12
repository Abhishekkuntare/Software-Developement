#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void Display(struct node *head)
{
    while (head != NULL)
    {
        printf("%d ", head->data);
        head = head->next;
    }
}

struct node *InsertAtIndex(struct node *head, int data, int index)
{
    struct node *ptr;
    ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p;
    p = head;

    int i = 0;

    while (i != index - 1)
    {
        p = p->next;
        i++;
    }
    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head;
}

int main()
{
    int num1, num2, num3, num4, item, index;

    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    printf("Enter the 1st Data: ");
    scanf("%d", &num1);
    head->data = num1;
    head->next = second;

    printf("Enter the 2nd Data: ");
    scanf("%d", &num2);
    second->data = num2;
    second->next = third;

    printf("Enter the 3rd Data: ");
    scanf("%d", &num3);
    third->data = num3;
    third->next = fourth;

    printf("Enter the 4th Data: ");
    scanf("%d", &num4);
    fourth->data = num4;
    fourth->next = NULL;

    printf("Linked list:");
    Display(head);

    printf("\nInsert item: ");
    scanf("%d", &item);

    printf("At Index: ");
    scanf("%d", &index);

    head = InsertAtIndex(head, item, index);

    printf("After insertion: ");
    Display(head);

    return 0;
}