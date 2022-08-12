#include <bits/stdc++.h>
using namespace std;

int main()
{

    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    cout << "Enter the " << n << " elements in array: " << endl;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Input array is: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            for (int k = i; k <= j; k++)
            {
                cout << arr[k] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}