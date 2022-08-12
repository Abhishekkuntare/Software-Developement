// #include <bits/stdc++.h>
// using namespace std;

// string move_all_x(string s)
// {
//     if (s.length() == 0)
//         return "";

//     char ch = s[0];
//     string ans = move_all_x(s.substr(1));
//     if (ch == 'x')
//         return ans + ch;
//     else
//         return ch + ans;
// }

// int main()
// {
//     cout << move_all_x("abxxxhi");
//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

string move_all_punchu(string name)
{
    if (name.length() == 0)
        return "";

    char ch = name[0];
    string ans = move_all_punchu(name.substr(1));
    if (ch == '!' || ch == '@' || ch == '$')
        return ans + ch;
    else
        return ch + ans;
}

int main()
{
    cout << move_all_punchu("abh!i$d@");

    return 0;
}