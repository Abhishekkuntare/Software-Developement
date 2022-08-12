#include <stdio.h>

void incrypt(char *st)
{
    char *ptr = st;
    while (*ptr != '\0')
    {
        *ptr = *ptr - 1;
        ptr++;
    }
}
void main()
{
    char str[100];
    printf("Enter your name :");
    gets(str);
    incrypt(str);
    printf("%s", str);
}