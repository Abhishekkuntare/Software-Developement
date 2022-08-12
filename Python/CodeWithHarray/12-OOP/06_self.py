
# class Employee:
#     company = "google" #class attribute
#     def getSalary(self , sign):
#         print(f"Salary is {self.salary} is in {self.company}\n{sign}")

# abhishek = Employee()

# Employee.getSalary # (abhishek)# abhishek.getSalary()   
# abhishek.salary = 20000 #instance attribute
# print(abhishek.salary,abhishek.company)

# abhishek.getSalary("thanks")

class Employee:
    Company = "Google"
    def getSalary(self):
        print(f"Salary is {self.salary} and Company name is {self.Company}")

aniket = Employee()
aniket.salary = 200
aniket.getSalary() 
# Employee.getSalary(aniket)