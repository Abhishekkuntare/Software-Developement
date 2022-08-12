#include <bits/stdc++.h>
using namespace std;

void Display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
}

void swap(int arr[], int lb, int ub)
{
    int temp = arr[lb];
    arr[lb] = arr[ub];
    arr[ub] = temp;
}

int partition(int arr[], int lb, int ub)
{
    int pivot = arr[ub];
    int i = lb - 1;

    for (int j = lb; j < ub; j++)
    {
        if (arr[j] < pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, ub);
    return i + 1;
}

void QuickSort(int arr[], int lb, int ub)
{
    if (lb < ub)
    {
        int loc = partition(arr, lb, ub);
        QuickSort(arr, lb, loc - 1);
        QuickSort(arr, loc + 1, ub);
    }
}

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter the " << n << " Size of array: ";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "Input array: " << endl;
    Display(arr, n);

    cout << endl;

    QuickSort(arr, 0, n - 1);
    cout << "After mergeSort: " << endl;
    Display(arr, n);

    return 0;
}