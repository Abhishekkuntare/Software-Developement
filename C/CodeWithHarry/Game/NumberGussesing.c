#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main()
{
    int number, guess, nguess = 1;
    srand(time(0));
    number = rand() % 100 + 1; // generate random number 1 to 100

    // printf("The number is %d\n", number);

    do
    {
        printf("Guess the number betwenn 1 to 100  \n");
        scanf("%d", &guess);

        if (guess < number)
        {
            printf("Higher number please\n !");
        }
        else if (guess > number)
        {
            printf("Lower Number please\n !");
        }
        else
        {
            printf("You guess in %d attemps : ", nguess);
        }
        nguess++;
    } while (guess != number);
    return 0;
}