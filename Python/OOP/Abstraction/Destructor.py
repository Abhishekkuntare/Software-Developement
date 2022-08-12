class Employee:
    def __init__(self , name, role,money):
        self.name = name    
        self.role = role
        self.money = money
    def __del__(self):
        print("Delete!⚠️")



# creting the objects and attributes
e1 = Employee("Abhishek","Software Developer",5959)
e2 = Employee("Aniket","Cyber Security Head",55)

print("Name: ", e1.name, "and Role: ",e1.role)
print("Name: ", e2.name, "and Role: ",e2.role)

del e1
# In the above output, deleting the object is displayed twice. The first one, when object e1 is explicitly deleted using del keyword. The second one, when the object e2 is deallocated from the memory implicitly.