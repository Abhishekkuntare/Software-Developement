#include <bits/stdc++.h>
using namespace std;

void subsets(int arr[], int n)
{
    int count = 0;
    for (int i = 0; i < (1 << n); i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i & (1 << j))
            {
                cout << arr[j] << " ";
                count++;
            }
        }
        cout << endl;
    }
    cout << count << endl;
}

int main()
{
    int arr[] = {1, 2, 3, 4};
    subsets(arr, 4);

    return 0;
}