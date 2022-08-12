// while we create the object we have to pass the parameteres  with the help of constructor

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

    void getName()
    {
        cout << name << endl;
    }

    void printInfo()
    {
        cout << name << endl;
        cout << id << endl;
        cout << gender << endl;
    }
};

int main()
{
    student a("abhishek", 4, false); // passing the parameters
    // a.printInfo();
    student b;
    student c(a);
    c.printInfo();

    return 0;
}