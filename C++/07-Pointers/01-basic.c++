#include <bits/stdc++.h>
using namespace std;
int main()
{
    // int a = 10;
    // int *a_ptr = &a; // pointer variable

    char ch = 'a';

    char *ch_ptr = &ch; // pointer variable

    // cout << *ch_ptr << endl;
    // cout << ++ch << endl;

    cout << ch_ptr << endl;
    ch_ptr++;
    cout << ch_ptr << endl;

    // cout << a_ptr << endl; // 0xa3dd3ff8b4
    // a_ptr++;               // increament by 4 bytes
    // cout << a_ptr;         // 0xa3dd3ff8b8

    // with the help pointer we can the change the value of variable
    // cout << *a_ptr << endl; // 10
    // *a_ptr = 20;
    // cout << a; // 20

    // cout << a << endl;       // 10
    // cout << &a << endl;      // address of a
    // cout << a_ptr << endl;   // address of a
    // cout << *a_ptr << endl;  // 10
    // cout << &a_ptr << endl;  // address of a_ptr
    // cout << *&a_ptr << endl; // address of a

    return 0;
}