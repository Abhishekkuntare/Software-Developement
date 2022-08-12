#include <stdio.h>
int main()
{
    char char_array[10];

    printf("Enter a rating (1-5) rating");
    scanf("%s", char_array[10]);

    switch (char_array[10])
    {
    case 'hi':
        printf("Hello");
        break;

    default:
        printf("Error!");
    }
    return 0;
}