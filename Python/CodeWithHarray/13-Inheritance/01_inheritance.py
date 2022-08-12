
# Parent class  or Base class
class Employee:
    company = "Google"

    @staticmethod
    def getDetails():
        print("Google's owner was sundar pichai")
    
# Child class or Derived class
class Boss (Employee):
        Degree = "Software Developer/Web Developer"
        company = "Microsoft"

        def getBossDetails(self):
            print(f"The qulification of boss is {self.Degree}")
        
        def getDetails(self):
            print(f"Microsoft's owner was bill gates")


e = Employee()
b = Boss()

e.getDetails()
b.getDetails()

print(b.company)
b.getBossDetails()