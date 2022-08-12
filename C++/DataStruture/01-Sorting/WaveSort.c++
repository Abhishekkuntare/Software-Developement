#include <bits/stdc++.h>
using namespace std;

void swap(int arr[], int x, int y)
{
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}

void wave_sort(int arr[], int n)
{
    for (int i = 1; i < n; i += 2)
    {
        if (arr[i] > arr[i - 1])
        {
            swap(arr, i, i - 1);
        }
        if (arr[i] > arr[i + 1] && i <= n - 2)
        {
            swap(arr, i, i + 1);
        }
    }
}

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;
    int arr[n];

    cout << "Enter the " << n << " size of array: ";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "input array: " << endl;
    display(arr, n);

    cout << endl;
    wave_sort(arr, n);
    cout << "Wave Sort: " << endl;
    display(arr, n);

    return 0;
}