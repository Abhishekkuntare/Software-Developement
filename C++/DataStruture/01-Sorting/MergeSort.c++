// Time complexitctiy 0(nlogn)
#include <bits/stdc++.h>
using namespace std;

void Display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
}

void Merge(int arr[], int LB, int mid, int UB)
{
    int i, j, k, B[50];

    i = LB;
    j = mid + 1;
    k = LB;

    while (i <= mid && j <= UB)
    {
        if (arr[i] < arr[j])
        {
            B[k] = arr[i];
            i++;
            k++;
        }
        else
        {
            B[k] = arr[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        B[k] = arr[i];
        k++;
        i++;
    }
    while (j <= UB)
    {
        B[k] = arr[j];
        k++;
        j++;
    }
    for (int i = LB; i <= UB; i++)
    {
        arr[i] = B[i];
    }
}

void MergeSort(int arr[], int LB, int UB)
{
    int mid;
    if (LB < UB)
    {
        mid = (LB + UB) / 2;
        MergeSort(arr, LB, mid);
        MergeSort(arr, mid + 1, UB);
        Merge(arr, LB, mid, UB);
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

    MergeSort(arr, 0, n - 1);
    cout << "After mergeSort: " << endl;
    Display(arr, n);

    return 0;
}
