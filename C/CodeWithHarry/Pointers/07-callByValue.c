#include <stdio.h>

int sum(int *x, int *y)
{
    int *z;
    int x = 10;
    int y = 20;
    *z = (*x) * (*y);
    return *z;
}

int main()
{
    int num1;
    int num2;
    int z;

    printf("Enter any number : ");
    scanf("%d", &num1);
    printf("Enter any number : ");
    scanf("%d", &num2);
    z = sum(num1, num2);
    printf("The mul of %d * %d = %d", num1, num2, z);

    return 0;
}