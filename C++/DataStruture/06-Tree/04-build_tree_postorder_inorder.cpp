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

int search(int inorder[], int start, int end, int curr)
{
    for (int i = start; i <= end; i++)
    {
        if (inorder[i] == curr)
        {
            return i;
        }
    }
    return -1;
}

struct node *buildTree(int postorder[], int inorder[], int start, int end)
{
    if (start > end)
        return NULL;

    static int idx = 4;
    int curr = postorder[idx];
    idx--;
    struct node *root = new node(curr);
    // find the number in inorder and take the index from it
    if (start == end)
        return root;
    int pos = search(inorder, start, end, curr);
    root->right = buildTree(postorder, inorder, pos + 1, end);
    root->left = buildTree(postorder, inorder, start, pos - 1);

    return root;
}

void inorderprint(struct node *root)
{
    if (root == NULL)
        return;
    {
        inorderprint(root->left);
        cout << root->data << " ";
        inorderprint(root->right);
    }
}

int main()
{
    int postorder[] = {4, 2, 5, 3, 1};
    int inorder[] = {4, 2, 1, 5, 3};

    struct node *new_root = buildTree(postorder, inorder, 0, 4);
    inorderprint(new_root);
    return 0;
}