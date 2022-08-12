#include <stdio.h>

int main()
{
    char name[30];
    float salary;
    FILE *ptr;
    ptr = fopen("user_data.txt", "w");

    printf("Enter your Name :");
    gets(name);
    printf("Enter your Salary :");
    scanf("%f", &salary);

    fprintf(ptr, "name - %s\nsalary - %.1f", name, salary);
    printf("Your details are saved in user_data.txt");
    fclose(ptr);
    return 0;
}