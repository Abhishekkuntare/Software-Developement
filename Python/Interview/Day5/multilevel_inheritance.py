
# # Multilevel inheritance
# class C:
#     def f1(self): # my default we pass parameter which is self 
#      print("Here is the f1 method")

# class D(C):
#     def f2(self):
#      print("Here is the f2 method")

# class E(D):
#     def f3(self):
#      print("Here is the f3 method ")

# d1 = E()
# d1.f1()
# d1.f2()
# d1.f3()


class A:
    
    # def paraMeterisedFun(self,a,b): # parameterised function
    #     self.a = a
    #     self.b = b

    # def __init__(self,a , b): #constructor
    #     self.a =a 
    #     self.b= b 

    def defaultFun(self): # Default Function
        self.a = int(input("Enter a value of a: "))
        self.b = int(input("Enter a value of b: "))

class B(A):
    def add(self):
        self.c =(self.a +self.b)
        print(self.c)

class C(B):
    def avg(self):
        self.x= self.c/2
        print(self.x)

# x = int(input("Enter the value: "))
# y = int(input("Enter the value: "))

# a1 =C(x,y) #paraMeterised consructor
# a1.paraMeterisedFun(x,y)

a1 = C() #create an object of C class
a1.defaultFun()

a1.add()
a1.avg()
