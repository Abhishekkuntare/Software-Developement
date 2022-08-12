#include <bits/stdc++.h>
using namespace std;

void display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

int binarySearch(int arr[], int size, int item)
{
    int start = 0, end = size, mid;

    while (start <= end)
    {
        mid = (start + end) / 2;
        if (item == arr[mid])
        {
            return mid;
        }
        else if (item < arr[mid])
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    return -1;
}

int main()
{

    int size;
    cout << "Enter the size of array: ";
    cin >> size;
    int arr[size];

    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    cout << "Input array: ";
    display(arr, size);

    cout << endl;

    int item;
    cout << "Search item: " << endl;
    cin >> item;

    int i = binarySearch(arr, size, item);
    if (i == -1)
    {
        cout << "Item not found:" << endl;
    }
    else
    {
        cout << "Item found in:" << i << " Location" << endl;
    }

    return 0;
}