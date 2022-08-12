#include <bits/stdc++.h>
using namespace std;

long long merge(int arr[], int l, int mid, int r)
{
    long long inv = 0;
    int n1 = mid - l + 1;
    int n2 = r - mid;
    int a[n1];
    int b[n2];
    for (int i = 0; i < n1; i++)
    {
        a[i] = arr[l + 1];
    }

    for (int i = 0; i < n1; i++)
    {
        b[i] = arr[mid + i + 1];
    }

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2)
    {
        if (a[i] <= b[i])
        {
            arr[k] = a[i];
            i++;
            k++;
        }
        else
        {
            inv += n1 - i;
            arr[k] = b[j];
            j++;
            k++;
        }
    }
    while (i < n1)
    {
        arr[k] = a[i];
        k++;
        i++;
    }
    while (j < n2)
    {
        arr[k] = a[j];
        k++;
        j++;
    }
    return inv;
}

long long mergeSort(int arr[], int lb, int ub)
{
    int mid, invertions = 0;
    if (lb < ub)
    {
        mid = (lb + ub) / 2;
        invertions += mergeSort(arr, lb, mid);
        invertions += mergeSort(arr, mid + 1, ub);
        invertions += merge(arr, lb, mid, ub);
    }
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "Count inversion: " << endl;
    cout << endl;
    cout << mergeSort(arr, 0, n - 1);
    cout << endl;
    return 0;
}