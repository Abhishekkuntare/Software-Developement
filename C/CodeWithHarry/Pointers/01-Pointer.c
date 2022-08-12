#include <stdio.h>
int main()
{
    int i = 72;
    int *j = &i;  // j will store now the address of i
    int **k = &j; /// k will now store the address of j

    printf("The value of i %d\n", i);
    printf("The adderss of i %u\n", &i);

    printf("The value of j %u\n", j);
    printf("The adderss of j %u\n", &j);

    printf("The value  of j %d\n", *j);
    printf("The value of j %d\n", *(&j));

    printf("The value of k is %d\n", k);
    printf("The address of k is %u\n", &k);
    printf("The value store in i of k is %d\n", **k);

    return 0;
}