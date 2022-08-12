#include <bits/stdc++.h>
using namespace std;

// by default access modifier is private
class students
{
public:          // access modifier
    string name; // data members
    int id;      // data memebers
    bool gender; // data memebers
};

main()
{
    students a; // creating the objects
    a.name = "Abhishek";
    a.id = 4;
    a.gender = 0;

    if (a.gender == 1 || a.gender == 0)
        cout << "Female" << endl;
    else
        cout << "Male" << endl;

    cout << a.name << endl;
}
