#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[] = {10, 20, 30, 40};
    int *arr_ptr = arr;

    // with the help of array index
    for (int i = 0; i < 4; i++)
    {
        cout << *(arr + i) << endl;
    }

    // with the help of pointer
    // for (int i = 0; i < 4; i++)
    // {
    //     cout << *arr_ptr << endl;
    //     arr_ptr++;
    // }

    return 0;
}