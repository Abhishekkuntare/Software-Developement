#include <bits/stdc++.h>
using namespace std;

void countSort(int arr[], int n)
{
    int k = arr[0];

    // find maximum element
    for (int i = 0; i < n; i++)
        k = max(k, arr[i]);
    cout << "Max: " << k << endl;

    // creating the count array, collecting the count repeating element
    int count[10] = {0}; // initil value 0
    for (int i = 0; i < n; i++)
        count[arr[i]] = count[arr[i]] + 1;

    cout << "repeating element: " << endl;
    for (int i = 0; i < n; i++)
        cout << count[i] << " ";
    cout << endl;

    // modifiying count array add the prev element with current element
    for (int i = 1; i <= k; i++)
        count[i] += count[i - 1];

    cout << "Count array: " << endl;
    for (int i = 0; i <= k; i++)
        cout << count[i] << " ";
    cout << endl;

    // creating the output array;
    int output[n];
    for (int i = n - 1; i >= 0; i--)
        output[--count[arr[i]]] = arr[i];

    // output array put in original arrray
    for (int i = 0; i < n; i++)
        arr[i] = output[i];
}

int main()
{
    int arr[] = {1, 3, 2, 3, 4, 1, 6, 4, 3};

    countSort(arr, 9);
    cout << "Count Sort: " << endl;
    for (int i = 0; i < 9; i++)
        cout << arr[i] << " ";

    return 0;
}