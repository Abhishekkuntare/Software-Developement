
class Programmer:
    Company = "Microsoft"
    def programmerInfo(self):
        print(f"Name:- {self.name}")
        print(f"Email:- {self.email}")
        print(f"Id:- {self.id}")



employee = Programmer()
print("Company----    " + employee.Company)
name = input("Enter your name:- ")
email = input("Enter your email:- ")
id = input("Enter your id:- ")

employee.name = name
employee.email = email
employee.id = id

employee.programmerInfo()

