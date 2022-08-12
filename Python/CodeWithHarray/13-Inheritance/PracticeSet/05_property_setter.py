class Employee:
    salary = 1000
    increment = 1.5

    @property
    def salaryIncrement(self):
        return self.salary * self.increment

    @salaryIncrement.setter
    def salaryIncrement(self,Total):
        self.increment = Total / self.salary

abhishek = Employee()
print(abhishek.salaryIncrement)
print(abhishek.increment)
abhishek.salaryIncrement = 2
print(abhishek.salaryIncrement)