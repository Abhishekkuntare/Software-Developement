#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; ++i)
        cin >> arr[i];

    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";
    cout << endl;

    int prev_diff = arr[1] - arr[0];
    int j = 2;
    int ans = 2;
    int current = 2;
    int max_index = INT_MIN;

    while (j < n)
    {
        if (prev_diff == arr[j] - arr[j - 1])
        {
            current++;
        }
        else
        {
            prev_diff = arr[j] - arr[j - 1];
            current = 2;
        }
        ans = max(ans, current);
        j++;
    }
    cout << endl;
    cout << ans << endl;
    return 0;
}