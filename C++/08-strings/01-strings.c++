#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;

    // getting input
    // cin >> str;
    // getline(cin, str);
    // cout << str;
    string name = "abhishek", surname = "abhishek";
    // cout << name + surname << endl; // Concatinate
    // name.append(surname);           // Add to the end in string (.append)
    // cout << name[2] << endl;        // print 2 index character
    // cout << name << endl;
    //  name.clear(); // .clear()
    // cout << name << endl;

    // if (!surname.compare(name))
    //     cout << "String are  equal!";
    // cout << surname.compare(name);

    // cout << name << endl;
    // // name.clear();
    // if (name.empty())
    //     cout << "String is empty";
    // else
    //     cout << "Not empty";

    // cout << name << endl;
    // name.erase(0, 3); // starts from 0 and delete 3 char
    // cout << name << endl;
    // cout << name.find("shek");

    name.insert(8, "pravin");
    cout << name << endl;

    sort(name.begin(), name.end());
    cout << name << endl;

    return 0;
}