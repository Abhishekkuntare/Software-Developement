#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    float *ptr;

    printf("How many memory allocation you want ?: ");
    scanf("%d", &n);

    ptr = (float *)malloc(n * sizeof(float));

    for (int i = 0; i < n; i++)
    {
        printf("Enter %d index memory allocated to: ", i);
        scanf("%f", &ptr[i]);
    }

    for (int i = 0; i < n; i++)
    {
        printf("The %d memory allocated to %.1f\n", i, ptr[i]);
    }

    return 0;
}
