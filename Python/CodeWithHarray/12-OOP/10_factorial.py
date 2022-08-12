

class Fact:
    def factorial(self):
        factorial =1
        for i in range(0,self.n):
         factorial = self.n * (i+1)
         return factorial

factorial_of = Fact()
factorial_of.n = int(input("Enter a number: "))
print(factorial_of.factorial())