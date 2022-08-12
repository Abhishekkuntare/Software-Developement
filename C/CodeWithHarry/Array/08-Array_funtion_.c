#include <stdio.h>

void printArray(int *ptr, int n)
{

    for (int i = 0; i < n; i++)
    {
        printf("The value of element of %d is %d\n", i + 1, *(ptr + i));
    }
}

int main()
{
    int number[] = {15, 34, 21, 52, 6, 7, 8};
    printArray(number, 7);

    return 0;
}