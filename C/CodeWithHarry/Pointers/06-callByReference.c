#include <stdio.h>
void wrong_swap(int a, int b); // wiill not give the output
void swap(int *a, int *b);     // giving the output
int main()
{
    int x = 3, y = 4;

    printf("the value of before call by value swapping %d And %d\n", x, y);
    // wrong_swap(x, y); // due to call by value will not give swap of
    printf("The address of before swap  x and y %u , %u\n", &x, &y);
    swap(&x, &y);
    printf("The value after calling by reference %d  and %d\n", x, y);
    printf("The address after swap of x and y %u , %u\n", &x, &y);
    printf("The value of x and y %d , %d\n", *(&x), *(&y));
    return 0;
}

// call by value
void wrong_swap(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}

// call by reference
void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}