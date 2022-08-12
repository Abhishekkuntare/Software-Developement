#include <stdio.h>
int main()
{
    FILE *ptr;
    int num1;
    char name[29];

    //  open a file
    ptr = fopen("sample.txt", "r");
    fscanf(ptr, "%d", &num1);
    fscanf(ptr, "%s", name);
    fclose(ptr);

    printf("The value of num1 is %d\n", num1);
    printf("The name is %s\n", name);

    return 0;
}