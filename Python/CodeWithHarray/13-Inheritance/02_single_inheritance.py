
class Employee:
    Company = "Google"

    def companyDetails(self):
        print("Google was founded on September 4, 1998, by Larry Page and Sergey Brin ")
    
class Micorsoft(Employee):

    @staticmethod
    def micorsoftDetails():
        print("Microsoft was founded by Bill Gates and Paul Allen ")

abhishek = Employee()
aniket = Micorsoft()

print(abhishek.Company)  
print(aniket.Company) #prints the same company becaue aniket is child of abhishek

abhishek.companyDetails()
aniket.companyDetails()

aniket.micorsoftDetails()
