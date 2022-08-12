#include <bits/stdc++.h>
using namespace std;

/*
1.. find the left shift
2.. then there | operation */
int SetBit(int n, int position)
{
    return (n | (1 << position));
}

int main()
{
    cout << SetBit(3, 2);
    return 0;
}