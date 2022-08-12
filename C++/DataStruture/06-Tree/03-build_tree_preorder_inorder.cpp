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
            return i;
    }
    return -1;
}

struct node *buildTree(int preorder[], int inorder[], int start, int end)
{
    if (start > end) //
        return NULL;

    // 1.set the curr value
    static int idx = 0;
    int curr = preorder[idx];
    idx++;
    struct node *root = new node(curr); // create dynamically node

    if (start == end) // if single element in inorder return those element
        return root;

    int pos = search(inorder, start, end, curr);               // search the element in inorder and return it's position
    root->left = buildTree(preorder, inorder, start, pos - 1); // call recursive left child
    root->right = buildTree(preorder, inorder, pos + 1, end);  // call recursing right child
    return root;                                               // return root;
}

void inorderPrint(struct node *root)
{
    if (root == NULL)
        return;
    inorderPrint(root->left);
    cout << root->data << " ";
    inorderPrint(root->right);
}

int32_t main()
{
    int preorder[] = {1, 2, 4, 3, 5};
    int inorder[] = {4, 2, 1, 5, 3};

    struct node *new_root = buildTree(preorder, inorder, 0, 4);
    inorderPrint(new_root);
}
