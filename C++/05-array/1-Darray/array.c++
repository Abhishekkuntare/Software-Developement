// #include <bits/stdc++.h>
// using namespace std;

// void display(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         cout << arr[i] << " ";
//     }
// }

// void maxmin(int arr[], int size, int minno, int maxno)
// {
//     for (int i = 0; i < size; i++)
//     {
//         if (arr[i] > maxno)
//         {
//             maxno = arr[i];
//         }
//         if (arr[i] < minno)
//         {
//             minno = arr[i];
//         }
//     }
//     cout << "Input array: ";
//     display(arr, size);
//     cout << endl;
//     cout << "max: " << maxno << endl
//          << "min: " << minno << endl;
// }

// int search(int arr[], int size, int item)
// {
//     cout << "Search item : " << endl;
//     cin >> item;
//     for (int i = 0; i < size; i++)
//     {
//         if (item == arr[i])
//             return i;
//     }
//     return -1;
// }

// int main()
// {
//     int n;
//     cout << "Enter the size of array: " << endl;
//     cin >> n;

//     int arr[n];
//     cout << "Enter the " << n << "Elements in array: " << endl;
//     for (int i = 0; i < n; i++)
//     {
//         cin >> arr[i];
//     }

//     int maxno = INT_MIN;
//     int minno = INT_MAX;
//     maxmin(arr, n, minno, maxno);

//     int item;
//     int final = search(arr, n, item);

//     if (final == -1)
//         cout << "Item not found in array!";
//     else
//         cout << "location:" << final << "  ";

//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

void minmax(int arr[], int n, int max_no, int min_no)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < min_no)
        {
            min_no = arr[i];
        }
        if (arr[i] > max_no)
        {
            max_no == arr[i];
        }
        cout << max_no << endl
             << min_no << endl;
    }
}

int main()
{

    int n;
    cout << "Enter the size of n: " << endl;
    cin >> n;
    int arr[n];
    for (int &a : arr)
    {
        cin >> a;
    }
    for (int &a : arr)
    {
        cout << a << " ";
    }

    int max_no = INT_MIN;
    int min_no = INT_MAX;
    minmax(arr, n, max_no, min_no);
    return 0;
}