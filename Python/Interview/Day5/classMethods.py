class student:
    school = "ramkrushna"
    name ="Abhishek"
    def __init__(self,m1,m2,m3):
        self.m1 =m1
        self.m2 =m2
        self.m3 =m3

    def avg(self):
        return ((self.m1+self.m2+self.m3)/3)

    @classmethod
    def info(cls):
        return (cls.school)

    @classmethod
    def stuName(cls):
        return (cls.name)

    @staticmethod
    def display():
        print("Hi welcome to rm")

s1=student(22,33,44)
s2=student(12,53,84)        

print(s1.avg())
print(s2.avg())
print(s1.info())
student.display()