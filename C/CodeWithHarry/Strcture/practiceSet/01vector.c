#include <stdio.h>

struct vector
{
    int x;
    int y;
};

int main()
{
    struct vector v1, v2;

    v1.x = 38;
    v1.y = 23;
    printf("The vector of v1 is x=%d and y=%d\n", v1.x, v1.y);

    v2.x = 18;
    v2.y = 97;
    printf("The vector of v2 is x=%d and y=%d\n", v2.x, v2.y);

    return 0;
}