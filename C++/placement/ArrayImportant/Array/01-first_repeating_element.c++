// #include <bits/stdc++.h>
// using namespace std;

// int main()
// {

//     int n;
//     cout << "Enter the size of array: ";
//     cin >> n;

//     cout << "Enter the " << n << " elements in array: " << endl;

//     int arr[n];
//     for (int i = 0; i < n; i++)
//     {
//         cin >> arr[i];
//     }

//     cout << "Input array is: ";
//     for (int i = 0; i < n; i++)
//     {
//         cout << arr[i] << " ";
//     }

//     int N = 100000;
//     int idx[N];

//     for (int i = 0; i < N; i++)
//     {
//         idx[i] = -1;
//     }

//     int min_index = __INT_MAX__;

//     for (int i = 0; i < n; i++)
//     {
//         if (idx[arr[i]] != -1)
//         {
//             min_index = min(min_index, idx[arr[i]]);
//         }
//         else
//         {
//             idx[arr[i]] = i;
//         }
//     }

//     cout << endl;
//     if (min_index == INT_MAX)
//     {
//         cout << "There is no repeat element in array: ";
//     }
//     else
//     {
//         cout << "The first repeating element is: " << min_index << endl;
//     }

//     return 0;
// }
