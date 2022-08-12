
class Vector:
    def __init__(self,vec):
        self.vec = vec
    
    def __str__(self):
        return (f"{self.vec[0]}i + {self.vec[1]}j + {self.vec[2]}")

    def __len__(self):
            return len(self.vec)



v = Vector([1,2,5,4])
v2 = Vector([6,5,4])
print(v)
print(v2)
print(len(v))