
class Employee:
    
    def __init__():
        print("Hello Employess!")

    def __init__(self,name,salary,id):
        self.name= name
        self.salary  = salary
        self.id = id 
    
    def printDetails(self):
        print(f"Name:- {self.name}")
        print(f"Salary:- {self.salary}")
        print(f"Id:- {self.id}")

name = input("Enter your name: ")
salary = input("Enter your salary: ")
id = input("Enter your id: ")

abhishek = Employee(name,salary,id) # abhishek = Employee() if we do not pass arguments throws an error missing three positional arguments 
abhishek.printDetails()