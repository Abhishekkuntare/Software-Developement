
class Employee:
    Company = "Facebook"

abhishek = Employee()
print(abhishek.Company)

# change the Attribute
Employee.Company = "Meta"
print(abhishek.Company)