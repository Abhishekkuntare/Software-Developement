

class Complex:
    def __init__(self,a,b):
        self.a =a
        self.b = b
    
    def __add__(self,c):
        return ({self.a} + {self.b})
        
    def __str__(self,c):
        return(f"{self.a} + {self.b} = {self.a + self.b}")
    
    def __mul__(self,c):
        add1 =( self.a * c.a) -( self.b * c.b)
        sub1 = (self.a * c.b) - (self.b * c.a )
        return Complex(add1,sub1)
    
   
        
c1 =Complex(1,2)
c2 = Complex(3,4)

print(c1 * c2)