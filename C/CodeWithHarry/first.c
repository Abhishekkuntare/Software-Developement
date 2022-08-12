// #include <stdio.h>
// int main()
// {
//     float pie = 3.14;
//     int r = 4;
//     float area_of_circle = pie * r * r;
//     printf("The area of circle %f", area_of_circle);
//     return 0;
// }

// #include <stdio.h>
// int main()
// {
//     int length;
//     int breadth;
//     printf("The value of length: \n");
//     scanf("%d", &length);
//     printf("The value of breadth:\n");
//     scanf("%d", &breadth);
//     printf("The area of reactangle %d", length * breadth);
//     return 0;
// }

#include <stdio.h>
int main()
{
    int principle;
    int rate;
    int year;

    printf("Enter the Principle:\n");
    scanf("%d", &principle);
    printf("Enter the Rate:\n");
    scanf("%d", &rate);
    printf("Enter the year:\n");
    scanf("%d", &year);

    printf("The simple interest is %d", ((principle * rate * year) / 100));
    return 0;
}