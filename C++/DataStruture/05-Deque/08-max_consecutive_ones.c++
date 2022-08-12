#include <bits/stdc++.h>
using namespace std;

int32_t main()
{
    int n, k;
    cin >> n >> k;
    vector<int> a(n);
    for (auto &i : a)
        cin >> i;

    int ans = 0, i = 0, zerocout = 0;
    for (int j = 0; j < n; j++)
    {
        if (a[j] == 0)
            zerocout++;
        while (zerocout > k)
        {
            if (a[i] == 0)
            {
                zerocout--;
            }
            i++;
        }
        ans = max(ans, j - i + 1);
    }
    cout << ans;
}