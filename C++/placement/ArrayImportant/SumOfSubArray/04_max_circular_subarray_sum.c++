#include <bits/stdc++.h>
using namespace std;

int kidane(int arr[], int n)
{
    int currentSum = 0;
    int max_sum = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        currentSum += arr[i];
        if (currentSum < 0)
        {
            currentSum = 0;
        }
        max_sum = max(max_sum, currentSum);
    }
    return max_sum;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Input array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    int wrap_sum;
    int non_wrap_sum;

    non_wrap_sum = kidane(arr, n);
    // cout << non_wrap_sum << endl;

    int totalSum = 0;
    for (int i = 0; i < n; i++)
    {
        totalSum += arr[i];
        arr[i] = -arr[i];
    }

    wrap_sum = totalSum + kidane(arr, n);
    cout << max(wrap_sum, non_wrap_sum);

    return 0;
}
