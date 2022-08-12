
class Employee:
    salary = 500
    bonus = 100

    @property
    def totalSalary(cls):
        return cls.salary + cls.bonus
    
    @totalSalary.setter
    def totalSalary(cls,Total):
        cls.bonus = Total - cls.salary

    
abhishek = Employee()

print(abhishek.totalSalary)

abhishek.totalSalary = 1000
print("Abhishek's Total Salary =" + str(abhishek.totalSalary))
print("Abhishek's Bonus = " + str(abhishek.bonus))

    


