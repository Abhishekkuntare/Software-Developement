#include <stdio.h>

int main()
{
    char name[10];
    char *ptr;
    ptr = &name[10];

    for (int i = 0; i < 10; i++)
    {
        printf("Enter the name of %d student: ", i + 1);
        scanf("%c", ptr);
        ptr++;
    }

    for (int i = 0; i < 10; i++)
    {
        printf("The of %d student is %c \n", i + 1, name[i]);
    }

    return 0;
}