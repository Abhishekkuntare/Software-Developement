#include <bits/stdc++.h>
using namespace std;

bool isSafe(int **arr, int x, int y, int n)
{
    // for column
    for (int row = 0; row < x; row++)
    {
        if (arr[row][y] == 1)
        {
            return false;
        }
    }

    // for left digonal
    int row = x;
    int col = y;

    while (row >= 0 && col >= 0)
    {
        if (arr[row][col] == 1)
        {
            return false;
        }
        col--;
        row--;
    }

    // for right digonal
    row = x;
    col = y;
    while (row >= 0 && col < n)
    {
        if (arr[row][col] == 1)
        {
            return false;
        }
        col--;
        row++;
    }
    return true;
}

int main()
{
    int n;
    cin >> n;

    int **arr = new int *[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = new int[n];
        for (int j = 0; j < n; j++)
        {
            arr[i][j] = 0;
        }
    }

    if ((arr, 0, n))
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cout << arr[i][j] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}