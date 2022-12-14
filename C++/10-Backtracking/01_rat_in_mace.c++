#include <bits/stdc++.h>
using namespace std;

// to check the rat is go there or not
bool isSafe(int **arr, int x, int y, int n) // here the x - forward & y-for downward directions.
{
    if (x < n && y < n && arr[x][y] == 1)
    {
        return true;
    }
    return false;
}

bool rat_in_mace(int **arr, int x, int y, int n, int **solArr)
{

    // if we have get the dir then set in solArr
    if (x == n - 1 && y == n - 1)
    {
        solArr[x][y] = 1;
        return true;
    }

    if (isSafe(arr, x, y, n))
    {
        solArr[x][y] = 1;
        if (rat_in_mace(arr, x + 1, y, n, solArr)) // move right dir
        {
            return true;
        }
        if (rat_in_mace(arr, x, y + 1, n, solArr)) // move downward dir
        {
            return true;
        }
        // if we have not get correct path then we use backtrack
        solArr[x][y] = 0; // backtracking
        return false;
    }
    return false;
}

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    // dynamically allocates memory
    int **arr = new int *[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = new int[n];
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }

    // dynamically allocates memory
    int **solArr = new int *[n];
    for (int i = 0; i < n; i++)
    {
        solArr[i] = new int[n];
        for (int j = 0; j < n; j++)
        {
            solArr[i][j] = 0; // initiliziing with 0;
        }
    }

    cout << "Rat path---" << endl;

    // if this fun is gives true then we have print the array
    if (rat_in_mace(arr, 0, 0, n, solArr))
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cout << solArr[i][j] << " ";
            }
            cout << endl;
        }
    }

    return 0;
}

// 1 0 1 0 1
// 1 1 1 1 1
// 0 1 0 1 0
// 1 0 0 1 1
// 1 1 1 0 1