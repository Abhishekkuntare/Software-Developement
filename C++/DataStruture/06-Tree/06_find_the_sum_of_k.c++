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

int sumAtK(struct node *root, int k)
{
    if (root == NULL)
        return -1;

    queue<struct node *> q;
    q.push(root);
    q.push(NULL);
    int level = 0;
    int sum = 0;

    while (!q.empty())
    {
        struct node *new_node = q.front();
        q.pop();
        if (new_node != NULL)
        {
            if (level == k)
            {
                sum += new_node->data;
            }
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
            level++;
        }
    }
    return sum;
}
int main()
{
    struct node *root = new node(1);
    root->left = new node(2);
    root->right = new node(3);
    root->left->left = new node(4);
    root->left->right = new node(5);
    root->right->right = new node(7);
    root->right->left = new node(6);

    cout << sumAtK(root, 2);
    return 0;
}