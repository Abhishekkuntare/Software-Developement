#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, k;           // n will be the no. elements in array
    cin >> n >> k;      // k will be the window size
    vector<int> arr(n); // arr be the array
    for (auto &i : arr)
        cin >> i;

    deque<int> dq;
    vector<int> ans;

    // for first k windows
    for (int i = 0; i < k; i++)
    {
        while (!dq.empty() and arr[dq.back()] < arr[i])
        {
            dq.pop_back();
        }
        dq.push_back(i);
    }

    // ans we got of first window
    ans.push_back(arr[dq.front()]);

    // rest of the elements
    for (int i = k; i < n; i++)
    {
        if (dq.front() == i - k)
        {
            dq.pop_front(); // remove first element
        }
        while (!dq.empty() and arr[dq.back()] < arr[i])
        {
            dq.pop_back();
        }
        dq.push_back(i);
        // arr top and max element added on deque
        ans.push_back(arr[dq.front()]);
    }
    for (auto &i : ans)
        cout << i << " ";
    return 0;
}