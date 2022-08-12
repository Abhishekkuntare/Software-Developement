class Athlete:
    def __init__(self,name,gender):
        self.name=name
        self.__gender=gender

    def running(self):
        if(self.__gender=="girl"):
            print("150mtr running")
        else:
            print("200mtr running")

    def set_gender(self,new_gender):
            self.__gender = new_gender

    def get_gender(self):
            return self.__gender


user_name = input("Enter your name: ")
user_gender = input("Enter your gender: ")

a1 = Athlete(user_name,user_gender)

a1.set_gender(user_gender)
data = a1.get_gender()
print(data)
a1.running()




