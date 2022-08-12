#include <stdio.h>

int main()
{
    int i = 10;

    printf("The value of  i %d\n", ++i);
    i++;
    ++i;
    printf("The value of  i %d\n", i);
    i += 10;
    printf("i increment by 10 %d\n", i);
    return 0;
}