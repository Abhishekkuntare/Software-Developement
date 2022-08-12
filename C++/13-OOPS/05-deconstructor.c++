
// deconstructor is specified by tiled(~) sign of start
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

    void printInfo()
    {
        cout << name << endl;
        cout << id << endl;
        cout << gender << endl;
    }

    ~student()
    {
        cout << "Destructor called" << endl;
    }
};

int main()
{
    student a("abhishek", 4, false);
    student b;
    student c(a);
    c.printInfo();

    return 0;
}