#include <stdio.h>
#include <string.h>

int main()
{

    // with %s print
    // char str[100];
    // printf("Enter your name : ");
    // gets(str);
    // printf("Good job ! %s", str);

    // with %c print
    char str2[] = {'a', 'b', 'h', 'i', '\0'};
    char *ptr = str2;
    while (*ptr != '\0')
    {
        printf("%c", *ptr);
        ptr++;
    }

    return 0;
}