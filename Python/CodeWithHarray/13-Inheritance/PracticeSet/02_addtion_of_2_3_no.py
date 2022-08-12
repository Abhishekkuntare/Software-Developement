
class AddTwoNo:
    def __init__(self,x,y):
        self.x = x
        self.y = y
    
    def __str__(self):
        return (f"Addition of Two No:  {self.x} + {self.y} = {self.x + self.y}")

class AddThreeNo(AddTwoNo):
    def __init__(self, x, y,z):
        super().__init__(x,y)
        self.z  = z
    
    def __str__(self):
        return (f"Addition of Three No:  {self.x} + {self.y} + {self.z} = {self.x + self.y + self.z}")
     


result1 = AddTwoNo(4,5)
result2 = AddThreeNo(1,2,3)

print(result1)
print(result2)