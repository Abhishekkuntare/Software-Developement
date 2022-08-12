#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n1, n2, n3;
    cout << "Enter the three elements: " << endl;
    cin >> n1 >> n2 >> n3;

    int m1[n1][n2];
    int m2[n2][n3];

    cout << "Enter the " << n1 * n2 * n3 << " elements in matrix:" << endl;

    cout << "First matrix: " << endl;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            cin >> m1[i][j];
        }
    }

    cout << "Second matrix: " << endl;
    for (int i = 0; i < n2; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            cin >> m2[i][j];
        }
    }

    cout << "Matrix 1: " << endl;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n2; j++)
        {
            cout << m1[i][j] << " ";
        }
        cout << endl;
    }

    cout << "Matrix2: " << endl;
    for (int i = 0; i < n2; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            cout << m2[i][j] << " ";
        }
        cout << endl;
    }

    int ans[n1][n3];

    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            ans[i][j] = 0;
        }
        cout << endl;
    }

    cout << "Multiplication: " << endl;
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            for (int k = 0; k < n2; k++)
            {
                ans[i][j] += m1[i][k] * m2[k][j];
            }
        }
    }
    for (int i = 0; i < n1; i++)
    {
        for (int j = 0; j < n3; j++)
            cout << ans[i][j] << " ";
        cout << endl;
    }

    return 0;
}
