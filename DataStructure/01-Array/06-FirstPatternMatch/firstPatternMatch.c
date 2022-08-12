#include <stdio.h>
#include <string.h>
int main()
{
    char text[20], pattern[20];
    int a, b;

    printf("Enter the string : ");
    gets(text);
    printf("Enter the pattern to find : ");
    gets(pattern);

    // length of pattern
    a = strlen(pattern);

    // length of text
    b = strlen(text);

    // loop run in upto legnth of text - length of pattern
    for (int i = 0; i <= b - a; i++)
    {
        int j;
        for (j = 0; j < a; j++)
            if (text[i + j] != pattern[j])
                break;

        if (j == a)
        {
            printf("pattern found at position %d \n", i);
        }
    }

    return 0;
}
