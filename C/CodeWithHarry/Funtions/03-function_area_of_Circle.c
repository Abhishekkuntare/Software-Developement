#include <stdio.h>
int square();
int main()
{
    float ans = square();
    printf("The area of square : %f", ans);
    return 0;
}
int square()
{
    float side;
    int ans;
    printf("Enter a area of side :");
    scanf("%f", &side);
    ans = side * side;

    return ans;
}