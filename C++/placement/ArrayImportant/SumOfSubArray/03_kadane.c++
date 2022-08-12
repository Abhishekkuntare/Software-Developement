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

    int currentSum = 0;
    int max_sum = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        currentSum = currentSum + arr[i];
        if (currentSum < 0)
        {
            currentSum = 0;
        }
        max_sum = max(max_sum, currentSum);
    }

    cout << "max: " << max_sum << endl;

    return 0;
}
