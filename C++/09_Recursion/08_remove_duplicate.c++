#include <bits/stdc++.h>
using namespace std;

string se(string s)
{
    if (s.length() == 0)
        return "";

    char ch = s[0];
    string ans = se(s.substr(1));
    // cout << ans << " ";
    if (ch == ans[0])
        return ans;
    else
        return ch + ans;
}

int main()
{
    cout << se("abbab");
    return 0;
}
