#include <stdio.h>

// decalring the typedef for using the one name in case vector
typedef struct vector
{
    int x;
    int y;
} vector;

// create a function for sum of two vector
vector sum_of_vector(vector v1, vector v2)
{
    vector result;
    result.x = v1.x + v2.x;
    result.y = v1.y + v2.y;
    return result;
}

int main()
{
    // initilize the terms
    vector v1, v2, sum;

    //  creating the x
    printf("Enter the value of v1 x :");
    scanf("%d", &v1.x);
    printf("Enter the value of v2 x :");
    scanf("%d", &v2.x);

    //  creating the y
    printf("Enter the value of v1 y :");
    scanf("%d", &v1.y);
    printf("Enter the value of v2 y :");
    scanf("%d", &v2.y);

    //  call the function
    sum = sum_of_vector(v1, v2);

    // use the sum here
    printf("The sum of %d + %d =  %d\n", v1.x, v2.x, sum.x);
    printf("The sum of %d + %d  = %d\n", v1.y, v2.y, sum.y);

    return 0;
}