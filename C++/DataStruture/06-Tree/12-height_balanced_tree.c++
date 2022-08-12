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

int height(struct node *root)
{
    if (root == NULL)
        return 0;

    return max(height(root->left), height(root->right)) + 1;
}

bool isbalanced(struct node *root)
{
    if (root == NULL)
        return true;

    if (isbalanced(root->left) == false)
        return false;
    if (isbalanced(root->right) == false)
        return false;

    int lh = height(root->left);
    int rh = height(root->right);
    if ((lh - rh) <= 1)
        return true;
    else
        return false;
}

int main()
{
    struct node *root = new node(1);
    root->left = new node(2);
    root->right = new node(3);
    root->left->left = new node(4);
    root->left->right = new node(4);
    root->left->left->right = new node(4);
    root->right->left = new node(5);

    struct node *root2 = new node(1);
    root2->left = new node(3);
    root2->left->left = new node(4);

    if (isbalanced(root2))
    {
        cout << "Balanced Tree";
    }
    else
    {
        cout << "Unbalanced Tree";
    }

    return 0;
}