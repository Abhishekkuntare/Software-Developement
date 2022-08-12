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

    int max_sum = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int sum = 0;
            for (int k = i; k <= j; k++)
            {
                sum += arr[k];
            }
            max_sum = max(max_sum, sum);
        }
    }
    cout << "Max Sum: " << max_sum << endl;
    return 0;
}