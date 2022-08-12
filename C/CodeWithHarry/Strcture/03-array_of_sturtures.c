#include <stdio.h>
#include <string.h>

struct employee
{
    int code;
    float salary;
    char name[10];
};

int main()
{
    struct employee facebook[10];
    facebook[0].code = 100;
    facebook[0].salary = 21.21;
    strcpy(facebook[0].name, "Abhishek");

    facebook[1].code = 101;
    facebook[1].salary = 2314.2;
    strcpy(facebook[1].name, "Aniket");

    printf("%d\n%.2f\n%s", facebook[0].code, facebook[0].salary, facebook[0].name);
    printf("\n");
    printf("\n");

    printf("%d\n%.2f\n%s", facebook[1].code, facebook[1].salary, facebook[1].name);
    return 0;
}