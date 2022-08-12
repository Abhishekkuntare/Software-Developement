#include <stdio.h>

int main()
{
    FILE *ptr;
    ptr = fopen("job.txt", "w");
    putc('c', ptr);
    putc('c', ptr);

    fclose(ptr);
    return 0;
}