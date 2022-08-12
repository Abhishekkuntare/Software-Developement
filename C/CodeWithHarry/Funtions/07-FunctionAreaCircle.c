#include <stdio.h>
#include <math.h>

int main()
{
    int side;
    printf("Enter the side of square :");
    scanf("%d", &side);
    printf("The side of %d is %f", side, pow(side, 2));
    return 0;
}
