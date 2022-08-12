#instance variable: which are define inside a init()are called as instance variable
#class variable :variable which are decalred inside a class but outside of a init 
#it is called as class variable

class car:
    wheel =4  #class variable

    def __init__(self) -> None:
        self.mil = 10  #mil and com are instance variable
        self.com = "Mercedies"

c1 =car()
c2 =car()
c1.mil = 8

print(c1.mil,c1.com,c1.wheel)
print(c2.mil,c2.com,c2.wheel)