class Maths:
    def square(self):
        print(f"The square of {self.n} is {self.n * self.n}")
    
    def cube(self):
        print(f"The square of {self.n} is {self.n * self.n * self.n}")

    def squareRoot(self):
        print(f"The square of {self.n} is {self.n ** 0.5}")



number = Maths()
n = int(input("Enter a number: "))

number.n = n

number.square()
number.cube()
number.squareRoot()