#include <bits/stdc++.h>
using namespace std;

// find those char which is number of times occure, means Frequency
int main()
{
    string str = "aabbbaa";

    int freq[26];

    // initilizing the array with  0
    for (int i = 0; i < 26; i++)
        freq[i] = 0;

    // update the array with there frequency
    for (int i = 0; i < str.size(); i++)
        freq[str[i] - 'a']++;

    int maxF = 0;
    char ans = 'a';

    for (int i = 0; i < 26; i++)
    {
        if (freq[i] > maxF)
        {
            maxF = freq[i]; // character frequency
            ans = i + 'a';  // to finding  the character
        }
    }

    cout << maxF << " " << ans << endl;

    return 0;
}
