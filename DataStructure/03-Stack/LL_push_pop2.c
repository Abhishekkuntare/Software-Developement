#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};
struct node *top = NULL;

void Traversal(struct node *top)
{
    while (top != NULL)
    {
        printf("%d\n", top->data);
        top = top->next;
    }
}
int UNDERFLOW(struct node *top)
{
    if (top == NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int OVERFLOW(struct node *top)
{
    struct node *p = (struct node *)malloc(sizeof(struct node)); // if we should not be allocate dinamically memory
    if (p == NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

struct node *push(struct node *top, int data)
{
    if (OVERFLOW(top))
    {
        printf("Stack is Overflow!\n");
    }
    else
    {
        struct node *n = (struct node *)malloc(sizeof(struct node));
        n->data = data;
        n->next = top;
        top = n;
        return top;
    }
}

int pop(struct node *ptr)
{

    if (UNDERFLOW(ptr))
    {
        printf("Stack is Underflow!\n");
    }
    else
    {
        struct node *n = ptr;
        top = ptr->next;
        int x = n->data;
        free(n);
        return x;
    }
}

int main()
{

    printf("After inserting stack:\n");
    top = push(top, 200);
    top = push(top, 20);
    top = push(top, 10);
    top = push(top, 50);
    top = push(top, 60);
    Traversal(top);

    int element = pop(top);

    printf("\nPoped element is:  %d\n", element);
    printf("After deletion Stack:\n");
    Traversal(top);
    return 0;
}