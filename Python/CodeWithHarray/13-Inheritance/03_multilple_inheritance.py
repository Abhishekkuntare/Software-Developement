
class Employee:
    Company ="Vivo"

class Product:
    Company ="Bottle"
    quntity = 0

    def upgradeQuantity(self):
        self.quntity = self.quntity + 1
        print(self.quntity)

class Customer(Employee,Product):
    name = "Abhishek"

c = Customer()

print(c.name)
print(c.quntity)
print(c.Company) 
c.upgradeQuantity()