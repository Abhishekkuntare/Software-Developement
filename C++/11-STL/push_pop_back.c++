#include <bits/stdc++.h>
#include <vector>
using namespace std;

int main()
{
    vector<int> myVector = {13, 4, 67, 7};
    for (auto &val : myVector)
    {
        cout << val << " ";
    }

    cout << endl;

    // push_back
    myVector.push_back(35);
    for (auto &val : myVector)
    {
        cout << val << " ";
    }

    cout << endl;

    // pop_back
    myVector.pop_back();
    for (auto &val : myVector)
        cout << val << " ";

    return 0;
}