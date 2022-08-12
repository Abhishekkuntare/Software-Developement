#include <stdio.h>
#include <string.h>

int main()
{
    char str1[10], str2[10];
    int compare;

    printf("Enter the str1: ");
    gets(str1);
    printf("Enter the str2: ");
    gets(str2);

    compare = strcmp(str1, str2);
    printf("%d", compare);

    return 0;
}