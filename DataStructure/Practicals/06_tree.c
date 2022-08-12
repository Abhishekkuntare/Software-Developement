#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

void inorder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->data);
        inorder(root->left);
        inorder(root->right);
    }
}

void preorder(struct node *root)
{
    if (root != NULL)
    {
        preorder(root->left);
        printf("%d ", root->data);
        preorder(root->right);
    }
}

void postorder(struct node *root)
{
    if (root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

struct node *new_node(int data)
{
    struct node *node = (struct node *)malloc(sizeof(struct node));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

struct node *insert(struct node *root, int data)
{
    if (root == NULL)
    {
        return new_node(data);
    }
    if (data < root->data)
    {
        root->left = insert(root->left, data);
    }
    else if (data > root->data)
    {
        root->right = insert(root->right, data);
    }
    return root;
}

int main()
{
    struct node *root = NULL;
    root = insert(root, 10);
    insert(root, 51);
    insert(root, 54);
    insert(root, 3);
    insert(root, 9);

    int choice;

    printf("1. Inorder  2. Preorder  3. Postorder\nEnter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
        inorder(root);
        break;
    case 2:
        preorder(root);
        break;
    case 3:
        postorder(root);
        break;
    default:
        printf("\nInvalid Choice!");
        break;
    }

    return 0;
}