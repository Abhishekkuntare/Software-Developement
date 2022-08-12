#include <stdio.h>

void sumAndAvg(int a, int b, int *sum, float *avg)
{
    *sum = a + b;
    *avg = (float)(*sum) / 2;
}
int main()
{
    int a, b, sum;
    float avg;

    printf("Enter a value of a :");
    scanf("%d", &a);
    printf("Enter a value of b :");
    scanf("%d", &b);

    sumAndAvg(a, b, &sum, &avg);
    printf("The sum of %d +%d = %d \n and the avg of %d  = %.1f\n", a, b, sum, sum, avg);

    return 0;
}