
class Employee:
    # create class atttribute and they are directly link with object 
    Company = "Google" #class attribute 
    required = "Software Developer" #class attribute

# object           # class 
abhishek = Employee()

print(abhishek.Company)
print(abhishek.required)

# changing the class attribute 
Employee.Company = "MicroSoft"
Employee.required = "Web Developer"

print(abhishek.Company)
print(abhishek.required)
