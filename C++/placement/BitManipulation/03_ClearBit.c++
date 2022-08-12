#include <bits/stdc++.h>
using namespace std;
/*
1.. find the left shift
2.. then there ~ compliment
3.. after that there & operation
*/
int ClearBit(int n, int position)
{
    int mask = (~(1 << position));
    return (n & mask);
}

int main()
{
    cout << ClearBit(7, 3);
    return 0;
}