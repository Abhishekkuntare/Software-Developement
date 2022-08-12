#include <stdio.h>
#include <string.h>

int main()
{
    char str[40] = "Abhi";
    char str1[] = "Abhi";
    int value = strcmp(str, str1);
    printf("The value is %d", value);
    return 0;
}