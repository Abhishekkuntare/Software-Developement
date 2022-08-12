#include <stdio.h>

void decrypt(char st[])
{
    char *ptr = st;
    while (*ptr != '\0')
    {
        *ptr = *ptr + 1;
        ptr++;
    }
}
void main()
{
    char st[10];
    printf("Enter your name to hash :");
    gets(st);
    decrypt(st);
    printf("%s", st);
}