#include <stdio.h>

int main()
{

    FILE *ptr;

    int id;
    char name[39];
    float salary;

    ptr = fopen("Job.txt", "r");

    if (ptr == NULL)
    {
        printf("This file does not exist!");
    }
    else
    {
        fscanf(ptr, "%d", &id);
        fscanf(ptr, "%f", &salary);
        fscanf(ptr, "%s", name);
        fclose(ptr);

        printf("Your id is %d\n", id);
        printf("Your salary is %.1f\n", salary);
        printf("Your name is %s\n", name);
    }
    return 0;
}