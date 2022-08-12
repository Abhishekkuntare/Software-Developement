#  crating a class Mobile 
class Mobile:

# When we create an object, the special method __init__() inside the class of that object is invoked automatically. This special method is called as a constructor  
    def __init__(self,name,prize,ram,camera):
        self.name = name
        self.prize = prize
        self.ram = ram
        self.camera = camera

# mob1 is object and inside () this all are attributes 
mob1 = Mobile("Apple", 3000,"8GB", "64MP")
print("Mobile 1 brand: ",mob1.name,"and prize",mob1.prize)
print("Camera:",mob1.camera,"Ram: ",mob1.ram)

print()

mob2 = Mobile("Vivo", 8000,"12GB","102MP")
print("Mobile 2 brand: ",mob2.name,"and prize",mob2.prize)
print("Camera:",mob2.camera,"Ram: ",mob2.ram)


