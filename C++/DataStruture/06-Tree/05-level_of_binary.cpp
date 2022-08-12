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

void printLevelOrder(struct node *root)
{
    if (root == NULL)
        return;
    queue<struct node *> q;
    q.push(root);
    q.push(NULL);

    while (!q.empty())
    {
        struct node *new_node = q.front(); // dynamically creating new node
        q.pop();                           // pop that new node
        if (new_node != NULL)
        {
            cout << new_node->data << " ";
            if (new_node->left)
            {
                q.push(new_node->left);
            }
            if (new_node->right)
            {
                q.push(new_node->right);
            }
        }
        else if (!q.empty())
        {
            q.push(NULL);
        }
    }
}

int main()
{
    struct node *root = new node(1);
    root->left = new struct node(2);
    root->right = new struct node(3);
    root->left->left = new struct node(4);
    root->left->right = new struct node(5);
    root->right->right = new struct node(6);
    root->right->left = new struct node(7);

    printLevelOrder(root);
    return 0;
}