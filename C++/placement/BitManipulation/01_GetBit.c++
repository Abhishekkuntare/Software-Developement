#include <bits/stdc++.h>
using namespace std;
/*
1.. find the left shift
2.. then there & operation
3.. after that compare it */
int GetBit(int n, int position)
{
    return ((n & (1 << position)) != 0);
}

int main()
{
    cout << GetBit(1, 3);
    return 0;
}