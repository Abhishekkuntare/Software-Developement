#include <bits/stdc++.h>
using namespace std;

void increment(int *a)
{
    ++*a;
}

// Pass By Refrence
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{

    int a = 10;
    int b = 20;

    // cout << a << endl;
    // increment(&a);
    // cout << a << endl;

    swap(&a, &b);
    cout << a << " " << b << endl;
    return 0;
}