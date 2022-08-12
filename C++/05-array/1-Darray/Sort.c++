#include <bits/stdc++.h>
using namespace std;

void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

// check number is greater then swap
void selectionSort(int arr[], int size)
{
    int i = 0;
    for (i = 0; i < size - 1; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (arr[j] < arr[i])
            {
                swap(&arr[i], &arr[j]);
            }
        }
    }
    cout << endl;
    cout << "After Selection Sort:";
    display(arr, size);
}

void bubbleSort(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
    cout << endl;
    cout << "After Bubble Sort:";
    display(arr, size);
}

void insertionSort(int arr[], int size)
{
    for (int k = k; k < size; ++k)
    {
        int temp = arr[k], ptr = k - 1;
        while (temp < arr[ptr])
        {
            arr[ptr + 1] = arr[ptr];
            ptr = ptr - 1;
        }
        arr[ptr + 1] = temp;
    }

    display(arr, size);
}
int main()
{
    int n;
    cout << "Enter the size of array: " << endl;
    cin >> n;

    int arr[n];
    cout << "Enter the " << n << "Elements in array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Selection Sort: ";
    display(arr, n);

    // selectionSort(arr, n);
    // bubbleSort(arr, n);
    insertionSort(arr, n);

    return 0;
}