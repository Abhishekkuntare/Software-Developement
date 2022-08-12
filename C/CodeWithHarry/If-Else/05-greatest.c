#include <stdio.h>

int main()
{
    int a, b, c, d;
    printf("Enter any four number to find greatest one\n:");
    scanf("%d", &a);
    printf("Enter any four number to find greatest two:");
    scanf("%d", &b);
    printf("Enter any four number to find greatest three\n:");
    scanf("%d", &c);
    printf("Enter any four number to find greatest one:\n");
    scanf("%d", &d);

    if (a > b && a > c && a > d)
    {
        printf("Greatet one %d", a);
    }
    else if (b > a && b > c && b > d)
    {
        printf("Greatet one %d", b);
    }
    else if (c > a && c > b && c > d)
    {
        printf("Greatet one %d", c);
    }
    else
    {
        printf("Greatest one %d", d);
    }
    return 0;
}