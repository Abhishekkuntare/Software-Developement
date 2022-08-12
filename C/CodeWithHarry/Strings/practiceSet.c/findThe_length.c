#include <stdio.h>

int strlength(char st[])
{
    char *ptr = st;
    int len = 0;
    while (*ptr != '\0')
    {
        len++;
        ptr++;
    }
    return len;
}
void main()
{
    char str[100];
    printf("Enter your name to find the length : ");
    gets(str);
    int l = strlength(str);
    printf("The length of %s is %d", str, l);
}