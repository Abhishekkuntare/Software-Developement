/* in operator overloading we have to use any operator to overload it
 in this case we overloaded the == equalilty  operator for check same or not*/
#include <bits/stdc++.h>
using namespace std;

class student
{
    string name;

public:
    int id;
    bool gender;

    // default constructor
    student()
    {
        cout << "Default constructor" << endl;
    }

    // parameterize constructor
    student(string s, int i, bool g)
    {
        cout << "parameterised construcotr" << endl;
        name = s;
        id = i;
        gender = g;
    }

    // copy constructor
    student(student &a)
    {
        cout << "Copy constructor" << endl;
        name = a.name;
        id = a.id;
        gender = a.gender;
    }

    // operator overloading

    bool operator==(student &a) // opereator is a keyword
    {
        if (name == a.name && id == a.id && gender == a.gender)
            return true;
        else
            return false;
    }
};

int main()
{
    student a("abhishek", 4, false);
    student b;
    student c = a;

    if (c == a)
        cout
            << "Same";
    else
        cout << "Unique";
    return 0;
}