#include <stdio.h>

int main()
{
    int num[4];
    float avg;
    printf("Enter number 1: ");
    scanf("%d", &num[0]);
    printf("Enter number 2: ");
    scanf("%d", &num[1]);
    printf("Enter number 3: ");
    scanf("%d", &num[2]);
    printf("Enter number 4: ");
    scanf("%d", &num[3]);

    avg = (float)(num[0] + num[1] + num[2] + num[3]) / 4;

    printf("The average of the numbers using arrays is %.1f", avg);

    return 0;
}