

import random

def SiccorPaperRock(com,you):
    # Draw 
    if (com == you):
        return 0
    
    if(you == 's' and com =='p'):
            return 1
    elif(you == 'p' and com == 's'):
        return -1
    elif(you == 'p' and com == 'r'):
        return 1
    elif(you == 'r' and com == 'p'):
        return -1
    elif(you =='s' and com == 'r'):
        return -1
    elif(you =='r' and com == 's'):
        return 1


print("Computer Choose:")
randNo = random.randint(1,3)

if(randNo ==1):
    com = 's'
elif(randNo ==2):
    com ='p'
elif(randNo ==3):
    com = 'r'

you = input("Your Turn: Scissor(s) , Paper(p) , Rock(r):- ")
result = SiccorPaperRock(com , you)
print(f"You Choose: {you} and Computer Choose: {com}")

if(result == 0):
    print("Game Draw!")
elif (result == 1):
    print("You Win !")
else:
    print("You Lose!")
