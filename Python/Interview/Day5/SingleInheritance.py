# class A:
#     def accept(self):
#         print("Welcome to accept method")

#     def display(self):
#         print("welcome to display method")

# class B(A): 
#     def get(self):
#         print("Welcome to get method")

#     def put(self):
#         print("welcome to put method")


# b1 = B() #create an object 
# b1.accept()
# b1.display()
# b1.get()
# b1.put()

''' assignment 
wap to create a class A having data members a and b 
and method getData() to accept the data and putData() to display the data
create a class B which access these a and b and having method addtion which will print the addition of two numbers
'''

class A:
    def putData(self):
        self.a = int(input("insert the value of a: "))
        self.b = int(input("insert the value of b: "))

    def getData(self):
        print(self.a,self.b)

class B(A):
    def addition(self):
        print("Addition: ",self.a + self.b)


b1 = B();
b1.putData()
b1.getData()
b1.addition()