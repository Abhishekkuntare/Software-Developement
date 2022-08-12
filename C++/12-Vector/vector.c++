#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> v;

    // push_back
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);

    // traditional way
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << endl;
    }

    // begin and end
    vector<int>::iterator it;
    for (it = v.begin(); it != v.end(); it++)
    {
        cout << *it << endl;
    }

    // using auto key
    for (auto &val : v)
        cout << val << endl;

    // pop_back
    v.pop_back();
    for (auto &val : v)
        cout << val << endl;

    // creating another vector
    vector<int> v12(3, 4);
    swap(v, v12);

    for (auto &val : v12)
        cout << val << " ";

    for (auto &val : v)
        cout << val << " ";

    return 0;
}