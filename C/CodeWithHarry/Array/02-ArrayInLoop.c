#include <stdio.h>

int main()
{
    int num[5];
    char name[2];
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the number %d :", i + 1);
        scanf("%d", &num[i]);
    }

    for (int i = 0; i < 5; i++)
    {
        printf("the value of marks of student %d ,%d \n", i + 1, num[i]);
    }

    return 0;
}