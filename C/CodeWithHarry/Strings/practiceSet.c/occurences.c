// #include <stdio.h>

// int occurences(char st[], char c)
// {
//     char *ptr = st;
//     int count = 0;
//     while (*ptr != '\0')
//     {
//         if (*ptr == c)
//         {
//             count++;
//         }
//         ptr++;
//     }
//     return count;
// }

// int main()
// {
//     char str[199];
//     printf("Enter your name find the occurrence :");
//     gets(str);
//     int count = occurences(str, 'b');
//     printf("occurcess = %d", count);
//     return 0;
// }
#include <stdio.h>

int present(char st[], char c[])
{
    char *ptr = st;
    char *ptr2 = c;
    while (*ptr != '\0')
    {
        if (*ptr == *ptr2)
        {
            printf("is present\n");
        }

        ptr++;
    }
}

int main()
{
    char str[199];
    char chr[39];
    printf("Enter your name  :");
    gets(str);

    printf("Which char you find in %s ? :", str);
    gets(chr);

    present(str, chr);

    return 0;
}