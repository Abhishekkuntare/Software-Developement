#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

// newNode function for initialisation of the newly created node

void postorder(struct node *root)
{
    if (root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

void preorder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}
struct node *new_node(int item)
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = item;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}

struct node *insert(struct node *node, int data)
{
    if (node == NULL)
    {
        return new_node(data);
    }
    if (data < node->data)
    {
        node->left = insert(node->left, data);
    }
    else if (data > node->data)
    {
        node->right = insert(node->right, data);
    }
    return node;
}

int main()
{
    struct node *root = NULL;
    root = insert(root, 9);
    insert(root, 7);
    insert(root, 5);
    insert(root, 8);
    insert(root, 14);
    insert(root, 11);
    insert(root, 16);

    int choice;
    printf("1. PostOrder  2. PreOrder  3. Inorder\nEnter your choice:\n");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
        printf("The PostOrder is: ");
        postorder(root);
        break;

    case 2:
        printf("PreOrder is: ");
        preorder(root);
        break;

    case 3:
        printf("The InOrder is: ");
        inorder(root);
        break;

    default:
        printf("Please Enter the correct choice: ");
        break;
    }

    return 0;
}