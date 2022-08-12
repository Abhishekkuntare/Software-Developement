// sum of subarray's

#include <bits/stdc++.h>
using namespace std;

int main()
{

    int n;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Input array: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            sum = sum + arr[j];
            cout << "Subarray: " << arr[j] << endl;
        }
    }
    cout << sum;

    return 0;
}
