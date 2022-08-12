#include <stdio.h>
#include <string.h>

typedef struct complex
{
    int x;
    int y;
} complex;

complex sum_of_vector(complex v1, complex v2)
{
    complex result;
    result.x = v1.x + v2.x;
    result.y = v1.y + v2.y;
    return result;
}

int main()
{
    complex v1, v2, sum;

    printf("Enter a value of v1 of x: ");
    scanf("%d", &v1.x);
    printf("Enter a value of v2 of x: ");
    scanf("%d", &v2.x);

    printf("Enter a value of v1 of y: ");
    scanf("%d", &v1.y);
    printf("Enter a value of v2 of y: ");
    scanf("%d", &v2.y);

    sum = sum_of_vector(v1, v2);
    printf("The sum of  %d + %d = %d\n", v1.x, v2.x, sum.x);
    printf("The sum of %d + %d = %d\n", v1.y, v2.y, sum.y);

    return 0;
}