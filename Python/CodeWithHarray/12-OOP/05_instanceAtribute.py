
class Employee:
    # creating class attribute 
    Company  = "Google"
    Salary = 100

abhishek = Employee()
aniket = Employee()


abhishek.Salary = 300 # creating the instance attribute 

print(aniket.Salary) # aniket.Salary = 200 # if we not give the instance attribute it takes from class attribute
    
print(abhishek.Salary)
 # print 300 because 1st preference is instance attribute 