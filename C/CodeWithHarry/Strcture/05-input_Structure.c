#include <stdio.h>
#include <string.h>

struct employee
{
    char name[100];
    int code;
    float salary;
};

int main()
{

    struct employee e1, e2, e3;

    printf("Enter your Name of e1 :");
    gets(e1.name);
    printf("Enter your Code of e1 :");
    scanf("%d", &e1.code);
    printf("Enter your Salary of e1 :");
    scanf("%f", &e1.salary);

    printf("\n");
    printf("\n");

    printf("Enter your Name of e2 :");
    gets(e2.name);
    printf("Enter your Code of e2 :");
    scanf("%d", &e2.code);
    printf("Enter your Salary of e2 :");
    scanf("%f", &e2.salary);

    printf("\n");

    printf("Enter your Name of e3 :");
    gets(e3.name);
    printf("Enter your Code of e3 :");
    scanf("%d", &e3.code);
    printf("Enter your Salary of e3 :");
    scanf("%f", &e3.salary);

    return 0;
}