#include <stdio.h>

float avg(int a, int b, int c);
int main()
{
    int a, b, c;
    printf("Enter a value of a : ");
    scanf("%d", &a);
    printf("Enter a value of b : ");
    scanf("%d", &b);
    printf("Enter a value of c : ");
    scanf("%d", &c);

    printf("The value of avg is %f", avg(a, b, c));

    return 0;
}
float avg(int a, int b, int c)
{
    float result;
    result = (float)(a + b + c) / 3;
    return result;
}