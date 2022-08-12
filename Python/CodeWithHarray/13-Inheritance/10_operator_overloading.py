
class Number:
    def __init__(self,num1):
        self.num1 = num1
    
    def __add__(self,num2):
        self.num2 = num2
        print("Lets Add.......")
        return self.num1 + num2.num1

        
        
    
    def __mul__(self,num2):
        print("Lets multiply..........")
        return self.num1 * num2.num1
    
    def __sub__(self,num2):
        print("Lets substract.........")
        return self.num1 - num2.num1
    
    def __truediv__(self,num2):
        print("Lets Divide............")
        return self.num1 / num2.num1


n1 = Number(10)
n2 = Number(2)

sum = n1 + n2   
print(sum)    

mul = n1 * n2
print(mul)

sub = n1 - n2
print(sub)

div = n1 / n2
print(div)