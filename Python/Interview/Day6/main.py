
#store class object in list

class Student:
        def __init__(self):
            self.roll = 0
            self.name = ""
            self.marks=0

        def Accept(self):       
            self.roll=int(input("Enter the roll no: "))
            self.name = input("Enter your name: ")
            self.marks = int(input("Enter your marks: "))

        def display(self):
            print("Roll no: ",self.roll)
            print("Name: ",self.name)
            print("Marks: ",self.marks)


# s =Student()
l =[]
n = int(input("How many record you want: "))

for i in range(n):
    s = Student()
    s.Accept()
    l.append(s)

for i in range(n):
    l[i].display()

#create an class Employee(id,name,salary) with a constructor to initilize the data members and display() method to all data 
#1.Accept n number of employee details
#2.Display that data in sorted orders of the name 
#3.Display that data in sorted order by salary