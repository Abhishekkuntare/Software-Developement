
class Number:
    def __init__(self,num1):
        self.num1 = num1
    
    def __add__(self,num2):
        self.num2 = num2
        print("Lets Add.......")
        return self.num1 + num2.num1
    
    def __str__(self):
        return(f"Decimal number: {self.num1}")
    
    @staticmethod
    def __len__():
        return 1
    
n = Number(8)
print(n)
print(len(n))