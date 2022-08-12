#include <stdio.h>
#include <string.h>

int main()
{
    char str1[39] = "Sher";
    char str2[] = "Abhi";
    strcat(str1, str2);
    printf("now the str1 %s", str1);
    return 0;
}