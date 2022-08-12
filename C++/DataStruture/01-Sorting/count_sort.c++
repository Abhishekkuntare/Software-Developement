#include <bits/stdc++.h>
using namespace std;

void countSort(int arr[], int n)
{
    // find the maximum element in array
    int k = arr[0];
    for (int i = 0; i < n; i++)
        k = max(k, arr[i]);
    cout << "Max: " << k << endl;

    // count the repeating element in array
    int count[10] = {0};
    for (int i = 0; i < n; i++)
        count[arr[i]]++;

    cout << "repeating elements: " << endl;
    for (int i = 1; i <= k; i++)
        cout << count[i] << " ";
    cout << endl;

    // add the current  element with prev element
    for (int i = 1; i <= k; i++)
        count[i] = count[i] + count[i - 1];

    cout << "Count array: " << endl;
    for (int i = 1; i <= k; i++)
        cout << count[i] << " ";
    cout << endl;

    int output[n];
    for (int i = 0; i < n; i++)
        output[--count[arr[i]]] = arr[i];

    cout << "Count Sort: " << endl;
    for (int i = 0; i < n; i++)
        cout << output[i] << " ";
    cout << endl;
}

int main()
{
    int arr[] = {1, 3, 2, 3, 4, 1, 6, 4, 3};
    countSort(arr, 9);
}