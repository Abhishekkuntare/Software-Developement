#include <stdio.h>

void slices(char str[], int m, int n)
{
    int i = 0;
    while ((m + i) < n)
    {
        str[i] = str[i + m];
        i++;
    }
    str[i] = '\0';
}

void main()
{
    char st[200];
    int start, end;
    printf("Enter your name :");
    gets(st);

    printf("Start slicing on which number :");
    scanf("%d", &start);

    printf("End slicing on which number :");
    scanf("%d", &end);

    printf("slices of %s", st);
    slices(st, start, end);

    printf("is  %s", st);
}