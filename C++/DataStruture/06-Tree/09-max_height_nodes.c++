#include <bits/stdc++.h>
using namespace std;

struct node
{
    int data;
    struct node *left;
    struct node *right;

    node(int val)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};

int max_height_nodes(struct node *root)
{
    if (root == NULL)
        return 0;

    int leftHeight = max_height_nodes(root->left);
    int rightHeight = max_height_nodes(root->right);

    return max(leftHeight, rightHeight) + 1;
}

int32_t main()
{
    struct node *root = new node(1);
    root->left = new node(2);

    root->right = new node(3);
    root->left->left = new node(4);
    root->left->left->left = new node(4);
    root->left->left->left->left = new node(4);
    root->left->left->left->left->left = new node(4);
    root->left->right = new node(5);
    root->right->right = new node(6);
    root->right->left = new node(7);

    cout << max_height_nodes(root);
}