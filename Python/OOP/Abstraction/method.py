# This ability to use something without having to know the details of how it is working is called as abstraction.

class Mobile:
    # constructor 
    def __init__(self,name,price):
        self.name =name     
        self.price = price

# We can access an attribute in a method by using self. 
    def details(self):
        print("Details-\n")
        print("Name:",self.name,"and Price:",self.price)

# object and attributes 
mob1 = Mobile("Vivov19", "100$")

mob1.details()#Inbound method invocation, We need not pass the value for self.
Mobile.details(mob1) #Outbound method invocation, We have to pass the object as the value of 