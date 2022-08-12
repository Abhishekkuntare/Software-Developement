
class Employee:

    Company = "HP"
    sales = 1000
    location = "Mumbai"

    @classmethod
    def changeCompany(cls,name):
        cls.Company = name
    
    @classmethod
    def changeSales(cls,sales):
        cls.sales = sales
    
    @classmethod
    def changeLocation(cls,location):
        cls.location = location

class Inherite(Employee):
    location = "Dubai"

e = Employee()
i = Inherite()

# change the company 
print(Employee.Company)
e.changeCompany("Asus")
print(Employee.Company)
print("\n")

# change the sales 
print(e.sales)
e.changeSales(2000)
print(e.sales)
print("\n")

# change the location 
location = input("What location you want ? :")
print(Employee.location)
e.changeLocation(location)
print(Employee.location)


print(i.sales)
