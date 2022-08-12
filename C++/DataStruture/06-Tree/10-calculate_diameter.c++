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

int calcHeight(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }
    return max(calcHeight(root->left), calcHeight(root->right)) + 1;
}
// O(n^2) complexity
int calcDiameter(struct node *root)
{
    if (root == NULL)
        return 0;

    int lHeight = calcHeight(root->left);
    int rHeight = calcHeight(root->right);
    int currDiameter = lHeight + rHeight + 1;

    int lDiameter = calcDiameter(root->left);
    int rDiameter = calcDiameter(root->right);

    return max(currDiameter, max(lDiameter, rDiameter));
}

// O(n) time complexity
int calcDiameter_easy(struct node *root, int *height)
{
    if (root == NULL)
    {
        *height = 0;
        return 0;
    }
    int lh = 0, rh = 0;
    int lDiameter = calcDiameter_easy(root->left, &lh);
    int rDiameter = calcDiameter_easy(root->right, &rh);

    int currDiameter = lh + rh + 1;
    *height = max(lh, rh) + 1;

    return max(currDiameter, max(lDiameter, rDiameter));
}

int main()
{
    struct node *root = new node(1);
    root->left = new node(2);
    root->right = new node(3);
    root->left->left = new node(2);
    root->left->right = new node(3);
    root->right->right = new node(3);
    root->right->left = new node(2);
    cout << calcDiameter(root) << endl;
    int height = 0;
    cout << calcDiameter_easy(root, &height);
    return 0;
}