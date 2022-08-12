#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
    int arr[] = {12, 23, 4, 5};

    for (int &value : arr) // use (&) for take the original value
        value++;

    for (int value : arr)
        cout << value << " ";
    cout << endl;

    // auto keyword use to detect any data type
    auto a = 1;
    cout << a << endl;

    int arr1[] = {1, 2, 3, 4, 54, 5};

    for (auto &value : arr1)
        cout << value << endl;
}