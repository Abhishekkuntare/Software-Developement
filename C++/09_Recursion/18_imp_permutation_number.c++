
#include <bits/stdc++.h>
using namespace std;

// creating the global vector
vector<vector<int>> ans;

void permutation(vector<int> &a, int index)
{
    if (index == a.size())
    {
        ans.push_back(a); // push the number in ans vector
        return;
    }
    for (int i = index; i < a.size(); i++)
    {
        swap(a[i], a[index]);
        permutation(a, index + 1); // increment the counter
        swap(a[i], a[index]);
    }
    return;
}

int main()
{
    int n;
    cout << "Enter the size of vecotr: ";
    cin >> n;

    // creating the vector of n size
    vector<int> a(n);
    for (auto &val : a)
        cin >> val;

    cout << "Input Vector: ";
    for (auto &val : a)
        cout << val << " ";

    permutation(a, 0); // 0 is the starting index

    cout << endl;
    for (auto val : ans)
    {
        for (auto i : val)
            cout << i << " ";
        cout << endl;
    }

    return 0;
}