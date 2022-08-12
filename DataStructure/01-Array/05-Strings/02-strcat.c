#include <stdio.h>
#include <string.h>

int main()
{
    char str1[10], str2[20];

    printf("Enter your name: ");
    gets(str1);

    printf("Enter your surname: ");
    scanf("%s", str2);

    strcat(str1, str2);

    puts(str1);

    return 0;
}