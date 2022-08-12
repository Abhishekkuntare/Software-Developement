#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int SnakeWaterGun(char you, char com)

// 0 snake snake , water water , gun gun case
{
    if (you == com)
    {
        return 0;
    }

    // 1 snake and water case
    if (you == 's' && com == 'w')
    {
        return 1;
    }
    else if (you == 'w' && com == 's')
    {
        return -1;
    }

    // 2 snake and gun case
    if (you == 's' && com == 'g')
    {
        return -1;
    }
    else if (you == 'g' && com == 's')
    {
        return 1;
    }

    // 3 water and gun case
    if (you == 'w' && com == 'g')
    {
        return 1;
    }
    else if (you == 'g' && com == 'w')
    {
        return -1;
    }
}

int main()
{
    int results;
    char you, com;
    srand(time(0));
    int number = rand() % 100 + 1;

    if (number < 33)
    {
        com = 's';
    }
    else if (number > 33 && number < 66)
    {
        com = 'w';
    }
    else
    {
        com = 'g';
    }

    printf("Enter 's' for Snake , 'g' for Gun , 'w' for Water: ");
    scanf("%c", &you);

    results = SnakeWaterGun(you, com);
    printf("You Choose %c : Com Choose %c\n", you, com);

    if (results == 0)
    {
        printf("Game draw!");
    }
    else if (results == 1)
    {
        printf("You win!");
    }
    else
    {
        printf("You lose!");
    }

    return 0;
}