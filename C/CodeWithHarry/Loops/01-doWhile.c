#include <stdio.h>
int main()
{
    int i = 20;
    int n = 10;
    printf("Enter any number : ");
    scanf("%d", &n);

    do
    {
        printf("%d\n", i + 1);
        i++;
    } while (i < n);
    return 0;
}