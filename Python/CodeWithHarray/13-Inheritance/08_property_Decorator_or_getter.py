
class Employee:
    Company = "BSNL"
    Recharge = 650
    Tax = 140

    @property
    def Total(self):
        return self.Recharge + self.Tax

abhishek = Employee()

print(abhishek.Total)
# print(abhishek.Total()) this will also print the total but we have comment the property decorator 