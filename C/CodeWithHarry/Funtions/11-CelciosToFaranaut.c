#include <stdio.h>

float celcious(int c);

int main()
{
    int c;
    printf("Enter the Celsius: ");
    scanf("%d", &c);

    printf("%d celsius = %f farenheit", c, celcious(c));
}

float celcious(int c)
{
    float formula;
    formula = (float)(c * 9 / 5) + 32;
    return (c * 9 / 5) + 32;
}