#include <stdio.h>
int main()
{
    int i = 23;
    int *j = &i;  // j will now store the address of i
    int **k = &j; // k will now store the address of j menas pointer to pointer

    printf("The value of i %d\n ", i);
    printf("The value of i from j %d \n", *j);

    printf("The address of i %u \n", &i);
    printf("The address of i from j %u \n", j);

    printf("The address of j is %u\n", &j);
    printf("The value of j is %u\n", *(&j));

    printf("The value of k %d\n", k);
    printf("The address of k %u\n", &k);
    printf("the address of j %u", **(&k));
}