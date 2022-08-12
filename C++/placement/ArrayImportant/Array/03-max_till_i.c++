#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    cout << "input array: " << endl;
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;

    int max_till_i = INT_MIN;
    int sum = 0;

    cout << "max_till_i: " << endl;
    for (int i = 0; i < n; i++)
    {
        max_till_i = max(max_till_i, arr[i]);
        cout << max_till_i << " ";
        sum += max_till_i;
    }
    cout << sum << endl;

    return 0;
}
