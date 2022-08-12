#include <stdio.h>

typedef struct complex
{
    int x;
    int y;
} complex;

void print(complex n)
{

    printf("The value of x is : %d \n", n.x);
    printf("The value of y is : %d \n", n.y);
}
int main()
{
    complex num[5];
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the value of x :");
        scanf("%d", &num[i].x);

        printf("Enter the value of y:");
        scanf("%d", &num[i].y);
    }
    for (int i = 0; i < 5; i++)
    {
        print(num[i]);
    }
    return 0;
}