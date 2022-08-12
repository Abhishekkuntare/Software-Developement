#include <stdio.h>

int main()
{
    FILE *ptr;
    ptr = fopen("Register.txt", "r");
    char c = fgetc(ptr);
    printf("The value of c is %c\n", fgetc(ptr));
    printf("The value of c is %c\n", fgetc(ptr));
    printf("The value of c is %c\n", fgetc(ptr));
    printf("The value of c is %c\n", fgetc(ptr));
    fclose(ptr);
    return 0;
}