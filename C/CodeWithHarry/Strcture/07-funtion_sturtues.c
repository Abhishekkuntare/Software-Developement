#include <stdio.h>
#include <string.h>

struct employee
{
    int code;
    float salary;
    char name[49];
};

void funtion(struct employee e1)
{
    printf("Enter the code of Employee :");
    scanf("%d", &e1.code);
    printf("Enter the salary of Employee : ");
    scanf("%f", &e1.salary);
    printf("Enter the name of Employee: ");
    scanf("%s", e1.name);

    printf("%d\n%.2f\n%s\n", e1.code, e1.salary, e1.name);
}
int main()
{
    // Declaring e1 and ptr
    struct employee emp;
    struct employee *ptr;

    // pointer ptr to e1
    ptr = &emp;

    // set the member values for e1 with arrow
    // ptr->code = 200;
    // ptr->salary = 32.32;
    // strcpy(ptr->name, "HTML");

    // set the member values for e1 with point
    // (*ptr).code = 170;
    // (*ptr).salary = 34.21;
    // strcpy((*ptr).name, "JS");

    // calling the function
    funtion(emp);

    return 0;
}