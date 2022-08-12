#include <stdio.h>

int main()
{
    FILE *ptr;
    ptr = fopen("sample.txt", "w"); //--> for write  a file
    ptr = fopen("sample.txt", "r"); //-->  for read  a file

    return 0;
}