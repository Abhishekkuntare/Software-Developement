#include <bits/stdc++.h>
using namespace std;

/*
1.. Clear the bit
2.. Setting the bit
*/
int UpdateBit(int n, int position, int value)
{
    int mask = ~(1 << position);
    int ClearBit = (n & mask);
    int SetBit = (ClearBit | (value << position));
    return SetBit;
}

int main()
{
    cout << UpdateBit(5, 1, 1);
    return 0;
}