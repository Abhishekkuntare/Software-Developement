#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> ans;

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    vector<int> arr(n);
    for (auto &val : arr)
        cin >> val;

    // STL
    sort(arr.begin(), arr.end()); // sort the array

    do
    {
        ans.push_back(arr);
    } while (next_permutation(arr.begin(), arr.end()));

    for (auto val : ans)
    {
        for (auto i : val)
        {
            cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}