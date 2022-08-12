#include <stdio.h>
int main()
{
    char ch;
    printf("Enter the Character :");
    scanf("%c", &ch);

    if (ch >= 65 && ch <= 90)
    {
        printf("Uppercase %d", ch);
    }
    else
    {
        printf("Lowercase %d", ch);
    }
}