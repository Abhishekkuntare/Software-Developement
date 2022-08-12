#include <bits/stdc++.h>
using namespace std;

int setBit(int n, int pos)
{
    return ((n & (1 << pos)) != 0);
}

void unique(int arr[], int n)
{
    int xorSum = 0;
    // take all the array elements ^ xor
    for (int i = 0; i < n; i++)
        xorSum ^= arr[i];

    int set_bit = 0;
    int pos = 0;
    int temp_xor = xorSum;

    // check the right most element is 1 or not
    while (set_bit != 1)
    {
        set_bit = xorSum & 1; // if 1 then we take there &
        pos++;                // increment the counter
        xorSum = xorSum >> 1; // and right shift the next element
    }

    // then take the xor of all right most setbit elements
    int new_xor = 0;
    for (int i = 0; i < n; i++)
    {
        if (setBit(arr[i], pos - 1))
        {
            new_xor = new_xor ^ arr[i];
        }
    }
    cout << "Unique number: " << endl
         << new_xor << endl;
    cout << (temp_xor ^ new_xor) << endl;
}

int main()
{
    int arr[] = {1, 3, 5, 5, 3, 1, 8, 9};

    unique(arr, 8);
    return 0;
}