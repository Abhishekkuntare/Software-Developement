#include <bits/stdc++.h>
using namespace std;

// bool pairsum(int arr[], int n, int k)
// {
//     for (int i = 0; i < n - 1; i++)
//     {
//         for (int j = i + 1; j < n; j++)
//         {
//             if (arr[i] + arr[j] == k)
//             {
//                 cout << i << " " << j << endl;
//                 return true;
//             }
//         }
//     }
//     return false;
// }

bool pairsum(int arr[], int n, int k)
{
    int low = 0;
    int high = n - 1;

    while (low < high)
    {
        if (arr[low] + arr[high] == k)
        {
            cout << "INDEX:" << low << " " << high << endl;
            return true;
        }
        else if (arr[low] + arr[high] > k)
        {
            high--;
        }
        else
        {
            low++;
        }
    }
    return false;
}

int main()
{
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int k = 26;

    bool i = pairsum;
    cout << pairsum(arr, 8, k);

    return 0;
}