// to access the data members in private access modifier we will create getters and setters

#include <bits/stdc++.h>
using namespace std;

class Employee
{
private: // access modifier
    string name;
    int id;

public:
    void setName(string s)
    {
        name = s;
    }
    void getName()
    {
        cout << name << endl;
    }
};

int main()
{
    Employee e1; // creating the object

    string name;
    cout << "Name: " << endl;
    cin >> name;

    e1.setName(name); // set input name
    e1.getName();     // get input name

    return 0;
}