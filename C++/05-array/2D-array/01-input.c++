// #include <bits/stdc++.h>
// using namespace std;

// int main()
// {
//     int n, m, item;
//     cout << "Enter the size of matrix: " << endl;
//     cin >> n >> m;

//     int matrix[n][m];

//     cout << "Enter the " << n * m << " size of matrix: " << endl;
//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             cin >> matrix[i][j];
//         }
//     }

//     cout << "Matrix: " << endl;

//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             cout << matrix[i][j] << " ";
//         }
//         cout << endl;
//     }

//     bool check = false;
//     cout << "Enter the item: " << endl;
//     cin >> item;

//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             if (item == matrix[i][j])
//             {
//                 cout << i << ", " << j << endl;
//                 check = true;
//                 cout << "Found!" << endl;
//             }
//         }
//     }
//     if (!check)
//         cout << "Element does not exits!" << endl;

//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int m, n, item;
    cout << "Enter the size of array: ";
    cin >> m >> n;

    int arr[m][n];
    cout << "Enter the " << m * n << "size of matrix: ";
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    cout << "Enter the item: ";
    cin >> item;

    bool check = true;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[i][j] == item)
            {
                check = true;
                cout << i << ", " << j;
            }
        }
    }
    if (!check)
        cout << "Element does not extist!";
    else
        cout << " index";

    return 0;
}