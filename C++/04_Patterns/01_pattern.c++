
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cout << "Enter the row and col: " << endl;
    cin >> n >> m;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}