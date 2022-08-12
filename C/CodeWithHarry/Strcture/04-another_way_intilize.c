#include <stdio.h>

struct employee
{
    int code;
    float salary;
    char name[100];
};

int main()
{

    struct employee bio = {122, 12.12, "Abhishek"};
    printf("The code is: %d\n", bio.code);
    printf("The salary is: %f\n", bio.salary);
    printf("The name is: %s\n", bio.name);

    return 0;
}