#include <bits/stdc++.h>
using namespace std;

void reverse_string(string s)
{
    stack<string> st; // stores the final string

    for (int i = 0; i < s.length(); i++)
    {
        string word = ""; // store the word up to space
        while (s[i] != ' ' && i < s.length())
        {
            word += s[i]; // adding the char in string word
            i++;
        }
        st.push(word); // push the word in to final string
    }

    while (!st.empty())
    {
        cout << st.top() << " "; // printf the top in desending order
        st.pop();                // pop the top in assecding order
    }
}

int main()
{
    string s = "Abhishek is a coder";

    reverse_string(s);
    return 0;
}
