#include <stdio.h>
#include <string.h>

struct employee
{
    int code;
    float salary;
    char name[100];
};

struct Bio
{
    char dream[19];
    char passion[120];
    int money;
};

struct parents
{
    char papa[10];
    char mummy[10];
};

void main()
{

    struct employee e1, e2;
    e2.code = 100;
    e1.salary = 12.12;
    strcpy(e1.name, "Abhishek");
    printf("%d\n%.2f\n%s", e2.code, e1.salary, e1.name);

    printf("\n");
    printf("\n");

    struct Bio b1;
    strcpy(b1.dream, "Mercedes, Dubai");
    strcpy(b1.passion, "Became a Full-Stack Web Developer ");
    b1.money = 20000000;
    printf("%s\n%s\n%d\n", b1.dream, b1.passion, b1.money);

    printf("\n");
    printf("\n");

    struct parents p1;
    strcpy(p1.papa, "Pravin");
    strcpy(p1.mummy, "Meena");
    printf("%s\n,%s\n", p1.papa, p1.mummy);
}
