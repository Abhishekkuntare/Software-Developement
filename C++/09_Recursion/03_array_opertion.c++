#include <bits/stdc++.h>
using namespace std;

// sorted or not
bool sorted(int arr[], int n)
{
    if (n == 1)
        return 1;

    bool checkArray = sorted(arr + 1, n - 1);
    if (arr[0] < arr[1] && checkArray)
        return true;
    else
        return false;
}

// assending
void inc(int n)
{
    if (n == 0)
        return;
    inc(n - 1); // call all the numbers then print
    cout << n << " ";
}

// dessending
void dec(int n)
{
    if (n == 0)
        return;
    cout << n << " ";
    dec(n - 1); // call each number then print
}

// searching

int search(int arr[], int n, int i, int key)
{
    if (i == n)
        return -1;

    if (arr[i] == key)
        return i;
    return search(arr, n, i + 1, key);
}

int search_last(int arr[], int n, int index, int item)
{
    if (index == n)
        return -1;
    int restArray = search_last(arr, n, index + 1, item);

    if (restArray != -1)
        return restArray;

    if (arr[index] == item)
        return index;
    else
        return -1;
}

int main()
{
    int arr[] = {1, 3, 5, 1};
    bool check = sorted(arr, 5);
    if (!check)
        cout << "Unsorted";
    else
        cout << "Sorted";

    int n = 5;
    // inc(n);
    cout << endl;
    // dec(n);

    int item = 1;
    cout << search(arr, 4, 0, item) << endl;
    cout << search_last(arr, 4, 0, item) << endl;

    return 0;
}