#include <stdio.h>
#include <stdlib.h>

void main()
{

    int num;
    int num1;
    int *ptr;
    int n = 2;

    printf("Which multiplication table you want: ");
    scanf("%d", &num);

    ptr = (int *)malloc(num * sizeof(int));

    for (int i = 0; i < 10; i++)
    {
        printf("%d * %d = %d\n", num, i + 1, num * (i + 1));
    }
    printf("\n");
    printf("\n");

    printf("Add in this multiplication table range you want: ");
    scanf("%d", &num1);

    ptr = realloc(ptr, num1 * sizeof(int));

    for (int i = 0; i < num1; i++)
    {
        printf("%d * %d = %d\n", num, i + 1, num * (i + 1));
    }
}