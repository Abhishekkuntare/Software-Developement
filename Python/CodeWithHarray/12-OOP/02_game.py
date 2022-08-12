class ContinueGame:
    def continueGame(self):
        continueGame = input("Game Over! playing Continue? ")
        return continueGame
  

class PressedError:
    def buttonError(self):
        print("wrong key pressed")

class Remote():
    def leftButton(self):
        leftClickbutton = input(f"Enter {L} for moving player left:- ")
        return leftClickbutton

    def rightButton(self):
        rightClickButton = input(f"Enter {R} for moving right:- ")
        return rightClickButton
    
    def topButton(self):
        topClickButton = input(f"Enter {T} for moving top:- ")
        return topClickButton
    
    def bottomButton(self):
        bottomClickButton = input(f"Enter {B} for moving bottom:- ")
        return bottomClickButton

    def jumpButton(self):
        jumpClickButton = input(f"Enter {J} for jumping:- ")
        return jumpClickButton

class Player:

    def playerName(self):
        print(f"Playing...... {self.name} ")

    def moveRight(self):
        print("moving right........")
    
    def moveLeft(self):
        print("moving left........")
    
    def moveTop(self):
        print("moving top........")

    def moveBottom(self):
        print("moving bottom........ \njumping.........")
    
    def jump(self):
        print("jumpping..........")


player1 = Player()
remote1 = Remote()
error  = PressedError()
playContinue = ContinueGame()

L = "l"
R = "r"
T = "t"
B = "b"
J =  "j"

player1.name = input("Player name:- ")
player1.playerName()

if(remote1.leftButton() and remote1.leftButton() == L):
        player1.moveLeft()
else:
    error.buttonError()
    

if(remote1.rightButton() and remote1.rightButton() == R):
    player1.moveRight()
else:
    error.buttonError()

if(remote1.topButton() and remote1.topButton() == T ):
    player1.moveTop()
else:
    error.buttonError()

if(remote1.bottomButton() and remote1.bottomButton() == B and remote1.bottomButton() == J):
    player1.moveBottom()
else:
    error.buttonError()

playContinue.continueGame()
Yes = "yes"
No = "no"
if(playContinue.continueGame == Yes ):
    print("Loading.......")
elif( playContinue.continueGame == No):
    print("Thanks for playing......")


