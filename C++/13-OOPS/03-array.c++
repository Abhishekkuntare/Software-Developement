#include <bits/stdc++.h>
using namespace std;

class students
{

    string name; // now this is a private access modifier

public: // access modifier
    int id;

    void setName(string s) // setting the name
    {
        name = s;
    }
    void getName() // getting the name
    {
        cout << name << endl;
    }
};

int main()
{
    int n;
    cout << "Enter the size of students: " << endl;
    cin >> n;

    students arr[n];

    for (int i = 0; i < n; i++)
    {
        string s;

        cout << "Name: " << endl;
        cin >> s;          // taking input
        arr[i].setName(s); // set the input string

        cout << "Id: " << endl;
        cin >> arr[i].id;
    }

    cout << "\n";
    for (int i = 0; i < n; i++)
    {
        arr[i].getName();
        cout << endl;
        cout << arr[i].id;
    }

    return 0;
}