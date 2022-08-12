#include <stdio.h>
#include <string.h>

int main()
{
    char str1[10], str2[10];

    printf("Enter the str1: ");
    gets(str1);
    printf("Enter the str2: ");
    gets(str2);

    strcpy(str2, str1);

    puts(str1);
    puts(str2);
    return 0;
}