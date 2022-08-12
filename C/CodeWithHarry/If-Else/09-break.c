#include <stdio.h>
int main()
{
    int i = 0, n;
    printf("Enter a value : ");
    scanf("%d", &n);
    do
    {
        printf("%d\n", i);
        if (i == 4)
        {
            break;
        }
        i++;
    } while (i < n);
    return 0;
}
