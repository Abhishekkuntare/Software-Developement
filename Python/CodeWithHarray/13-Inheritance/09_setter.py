class Employee:
    Company = "BSNL"
    Recharge = 600
    Tax = 100

    @property
    def Total(self):
        return self.Recharge + self.Tax
    
    @Total.setter
    def Total(self,value):
        self.Tax = value - self.Recharge

abhishek = Employee()

# Total = int(input("What is Bill of Brodband:- "))
# abhishek.Total = Total
print("Reahcarge = " + str(abhishek.Recharge))
abhishek.Total = 800
print("Total = "+str(abhishek.Total) )
print("Tax = " +str(abhishek.Tax))
