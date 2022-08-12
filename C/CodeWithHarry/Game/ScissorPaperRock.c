#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int ScissorPaperRock(char you, char com)
{
    // case 0 scissor scissor paper paper rock rock
    if (you == com)
    {
        return 0;
    }

    // pr

    // case 1 scissor paper
    if (you == 's' && com == 'p')
    {
        return 1;
    }
    else if (you == 'p' && com == 's')
    {
        return -1;
    }

    // case 2 scissor rock
    if (you == 's' && com == 'r')
    {
        return -1;
    }
    else if (you == 'r' && com == 's')
    {
        return 1;
    }

    // case 3 paper rock
    if (you == 'p' && com == 'r')
    {
        return 1;
    }
    else if (you == 'r' && com == 'p')
    {
        return -1;
    }
}
int main()
{
    char you, com;
    int results;
    srand(time(0));
    int number = rand() % 100 + 1;

    if (com < 33)
    {
        com = 's';
    }
    else if (com > 33 && com < 66)
    {
        com = 'p';
    }
    else
    {
        com = 'r';
    }

    printf("Enter 's' for Scissor, 'p' for Paper, 'r' for Rock: ");
    scanf("%c", &you);

    results = ScissorPaperRock(you, com);
    printf("You choose %c : com choose %c\n", you, com);

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