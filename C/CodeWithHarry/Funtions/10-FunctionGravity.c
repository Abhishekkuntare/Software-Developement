#include <stdio.h>

float gravity(float mass);
int main()
{
    int m;
    printf("Enter the value of mass in kgs : ");
    scanf("%d", &m);

    printf("The value of force in newton is %.1f", gravity(m));

    return 0;
}

float gravity(float mass)
{
    float result;
    result = mass * 9.8;
    return result;
}