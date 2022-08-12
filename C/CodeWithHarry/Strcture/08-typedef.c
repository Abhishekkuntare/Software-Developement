#include <stdio.h>
#include <string.h>

// creating the custom
typedef struct employee
{
    int code;
    float salary;
    char name[90];
} emp;

void function(emp emp1)
{
    printf("Enter the code of employee :");
    scanf("%d", &emp1.code);
    printf("Enter the salary of employee :");
    scanf("%f", &emp1.salary);
    printf("Enter the name of employee :");
    scanf("%s", &emp1.name);

    printf("%d\n%.1f\n%s\n", emp1.code, emp1.salary, emp1.name);
}

void main()
{

    emp e1;
    emp *ptr;
    ptr = &e1;
    function(e1);
}