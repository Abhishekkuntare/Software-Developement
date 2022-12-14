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
int sum_of_all_nodes(struct node *root)
{
    if (root == NULL)
        return 0;
    return sum_of_all_nodes(root->left) + sum_of_all_nodes(root->right) + root->data;
}
int32_t main()
{
    struct node *root = new node(1);
    root->left = new node(2);
    root->right = new node(3);
    root->left->left = new node(4);
    root->left->right = new node(5);
    root->right->right = new node(7);
    root->right->left = new node(6);
    cout << sum_of_all_nodes(root) << endl;
}