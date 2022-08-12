#include <bits/stdc++.h>
using namespace std;

void swap(int arr[], int x, int y)
{
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

void DNF(int arr[], int n)
{
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid <= high)
    {
        if (arr[mid] == 0)
        {
            swap(arr[mid], arr[low]);
            low++;
            mid++;
        }
        else if (arr[mid] == 1)
        {
            mid++;
        }
        else
        {
            swap(arr[mid], arr[high]);
            high--;
        }
    }
}

int main()
{
    int arr[] = {1, 0, 0, 2, 1, 0, 1, 2, 1, 2};
    cout << "DNF: " << endl;
    for (auto &val : arr)
        cout << val << " ";

    cout << endl;
    cout << "After DNF: " << endl;
    DNF(arr, 10);
    for (auto &val : arr)
        cout << val << " ";

    return 0;
}