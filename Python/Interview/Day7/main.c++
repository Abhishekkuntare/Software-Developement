// #include <bits./stdc++.h>
#include <iostream>
using namespace std;

class Student
{

    // whole class is encapsulation means private and public section
private:           // this i s a abstraction
    int roll;      // 2bye
    char name[12]; // 1*12 which means 13 byte
    int marks;     // 2byte
    // total space is 2+12+2 = 16byte required for this class

public:
    void getData() // this is a defination
    {
        cout << "\nEnter roll name and marks: "; //<< Insertion operator
        cin >> roll >> name >> marks;            //>>Extraaction operator
    }
    void putdata()
    {
        cout << "\nRoll no:" << roll << "\tName:" << name << "\tMarks:" << marks;
    }
}; //; class terminated here

int main()
{
    Student s1;
    Student s2;
    Student s3;
    s1.getData();
    s1.putdata();
    s2.getData();
    s2.putdata();
    s3.getData();
    s3.putdata();
    return 0;
}