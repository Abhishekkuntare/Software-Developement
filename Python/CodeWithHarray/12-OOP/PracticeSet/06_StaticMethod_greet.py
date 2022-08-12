
class Calculator:

    @staticmethod
    def greet():
        print("------Here you find the square,cube,squareRoot and cubeRoot of any number-------")

    def __init__(self,num):
        self.num = num
    
    def square(self):
        print(f"The square of {self.num} is {self.num **2}")
    
    def squareRoot(self):
        print(f"The square root of {self.num} is {self.num **0.5}")
    
    def cube(self):
        print(f"The cube of {self.num} is {self.num **3}")

    def cubeRoot(self):
        print(f"The cube root of {self.num} is {self.num  ** (1. / 3)}")


n = int(input("Enter a number to find square,cube and square root:- "))
number = Calculator(n)

number.greet()
number.square()
number.squareRoot()
number.cube()
number.cubeRoot()
