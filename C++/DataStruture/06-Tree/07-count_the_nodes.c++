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
int count_no_of_node(struct node *root)
{
    if (root == NULL)
        return 0;
    return count_no_of_node(root->left) + count_no_of_node(root->right) + 1;
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
    cout << count_no_of_node(root) << endl;
}