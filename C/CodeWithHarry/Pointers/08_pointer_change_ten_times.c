

#include <stdio.h>

int ten_times(int *n)
{
    *n = 5;
    printf("Ten Times of a is = %d", *n + 10);
}

int main()
{
    int a;
    ten_times(&a);
    return 0;
}