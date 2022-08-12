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

    int currsum[n + 1];
    currsum[0] = 0;

    for (int i = 1; i <= n; i++)
    {
        currsum[i] = currsum[i - 1] + arr[i - 1];
    }

    int maxSum = INT_MIN;
    for (int i = 1; i <= n; i++)
    {
        int sum = 0;
        for (int j = 0; j < i; j++)
        {
            sum = currsum[i] - currsum[j];
            maxSum = max(sum, maxSum);
        }
    }
    cout << endl;
    cout << "Max Sum " << maxSum << endl;
    return 0;
}