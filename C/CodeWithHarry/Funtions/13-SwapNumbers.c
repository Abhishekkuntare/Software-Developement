#include <stdio.h>

void swap(int *a, int *b)
{
    int temp;
    temp = *a; // * can accepts the value of x and y
    *a = *b;
    *b = temp;
}
int main()
{
    int x = 5, y = 6;
    printf("The unswap values %d %d\n", x, y);
    swap(&x, &y); // &  gives the address of x and y
    printf("The  swap values are %d  %d\n", x, y);

    return 0;
}