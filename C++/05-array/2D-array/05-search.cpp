#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n1, n2, item;
    cout << "Enter two elements: ";
    cin >> n1 >> n2;

    int m1[n1][n2];

    cout << "Enter the " << n1 * n2 << "size of array: " << endl;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
            cin >> m1[i][j];
    }

    cout << "Input array: " << endl;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
            cout << m1[i][j] << " ";
        cout << endl;
    }

    cout << "Enter the item: " << endl;
    cin >> item;

    int start = 0, end = n2 - 1;
    bool check = false;

    while (start < end && end >= 0)
    {
        if (m1[start][end] == item)
        {
            cout << start << "," << end << endl;
            return true;
        }
        else if (m1[start][end] > item)
        {
            end--;
        }
        else
        {
            start++;
        }
    }

    if (!check)
        cout << "Element does not exits!" << endl;

    return 0;
}
