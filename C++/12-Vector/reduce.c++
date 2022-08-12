// #include <bits/stdc++.h>
// using namespace std;

// bool myCompare(pair<int, int> p1, pair<int, int> p2)
// {
//     return p1.first < p2.first;
// }

// int main()
// {
//     int arr[] = {10, 16, 7, 14, 5, 3, 12, 9};
//     vector<pair<int, int>> v;

//     // making the pair
//     for (int i = 0; i < (sizeof(arr) / sizeof(arr[0])); i++)
//     {
//         v.push_back(make_pair(arr[i], i));
//     }
//     // sort array
//     sort(v.begin(), v.end(), myCompare);

//     // set the index
//     for (int i = 0; i < v.size(); i++)
//     {
//         arr[v[i].second] = i;
//     }

//     for (int i = 0; i < v.size(); i++)
//     {
//         cout << arr[i] << " ";
//     }
//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

bool myCompare(pair<int, int> v1, pair<int, int> v2)
{
    return v1.first < v2.first;
}

int main()
{
    int arr[] = {10, 16, 7, 14, 5, 3, 12, 9};
    vector<pair<int, int>> v;

    // make the pair
    for (int i = 0; i < (sizeof(arr) / sizeof(arr[i])); i++)
    {
        v.push_back(make_pair(arr[i], i));
    }
    // sort the array with correct way
    sort(v.begin(), v.end(), myCompare);

    // setting the index
    for (int i = 0; i < v.size(); i++)
    {
        arr[v[i].second] = i;
    }

    for (auto &val : arr)
    {
        cout << val << " ";
    }
    return 0;
}