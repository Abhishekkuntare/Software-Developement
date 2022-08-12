
class A:
    def f1(self):   
        self.a = int(input("Enter a number: "))
        print(self.a)

class B():
    def f2(self):
        self.b = int(input("Enter a number: "))
        print(self.b)

class C(A,B):
    def f3(self):   
        if(self.a>self.b):
            print("max:",self.a)
        if(self.a<self.b):
            print("min: ", self.a)


c1 = C()
c1.f1()
c1.f2()
c1.f3()
