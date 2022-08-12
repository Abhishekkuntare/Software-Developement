#include <stdio.h>

int main()
{

    char str[] = {'A', 'B', 'H', 'I', '\0'};
    char *ptr = str;
    while (*ptr != '\0')
    {
        printf("%c", *ptr);
        ptr++;
    }
    char str[] = {"Abhishek"};
    printf("%s", str);
}