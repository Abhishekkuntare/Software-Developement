#include <stdio.h>

int main()
{
    int i = 9;
    int *j = &i;
    char a = 'a';
    char *b = &a;

    printf("The address of i %u\n", j);
    j++;
    printf("The address of i %u\n", j);
    j++;
    printf("The address of i %u\n", j);

    //  char
    printf("The address of a %u\n", b);
    b++;
    printf("The address of a %u\n", b);

    return 0;
}