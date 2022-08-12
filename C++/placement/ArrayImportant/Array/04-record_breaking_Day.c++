
// record breaking day
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n + 1];
    arr[n] = -1;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Input array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    int ans = 0, mx = -1;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > mx && arr[i] > arr[i + 1])
        {
            ans++;
        }
        mx = max(mx, arr[i]);
        cout << mx << " ";
    }
    cout << endl;
    cout << ans << endl;

    return 0;
}