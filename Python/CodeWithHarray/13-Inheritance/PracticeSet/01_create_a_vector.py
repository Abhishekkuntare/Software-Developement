
class Vector2D:
    
    def __init__(self,i,j):
        self.i = i
        self.j = j
    
    def __str__(self):
        return (f"{self.i}i + {self.j}j")

class Vector3D(Vector2D):

    def __init__(self, i, j,k):
        super().__init__(i,j)
        self.k = k
    
    def __str__(self):
        return (f"{self.i}i + {self.j}j + {self.k}k")

v2 = Vector2D(3,4)
v3  = Vector3D(5,6,7)

print(v2)
print(v3)