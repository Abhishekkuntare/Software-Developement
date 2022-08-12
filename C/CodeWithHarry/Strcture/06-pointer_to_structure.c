#include <stdio.h>

struct employee
{
    int code;
    float salary;
    char name[300];
};

int main()
{
    struct employee e1;
    struct employee *ptr;

    ptr = &e1;
    (*ptr).code = 1011;
    ptr->salary = 32.32;
    printf("The code is %d\n", e1.code);
    printf("The salary is %.2f\n", e1.salary);
    return 0;
}