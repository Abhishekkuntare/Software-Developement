# # crating a class Mobile
# class Mobile:
#     pass

# # In the below code, we are creating two objects, each with its own reference variable
# mob1 = Mobile()
# mob2 = Mobile()

# # in the below code we are creating two attributes price and brand
# mob1.name = 'Vivov19'
# mob1.prise = 20000
# mob1.android_version = "Pie"

# mob2.name = 'Vivo15'
# mob2.prize = 25000
# mob2.android_version = "Red"

# print(mob1.name)
# print(mob2.name)


# creating a class
class Language:
        def __init__(self,name,uses,duration):
            self.name = name
            self.uses = uses    
            self.duration = duration

        def print_details(self):
            print("Name:",self.name,"Uses:",self.uses,"Duration:",self.duration)

        def append_name(self,name,time):
            list1 = []
            if(self.name == name):
                list1.append(self.name)
                print(list1)

            if(self.duration == time):
                list1.clear()
                print(list1)
            else:
                print("Duration is Almost good !")
            
            

# creating the object and attributes of class 
l1 = Language("JavaScript", "Frontend", 8)
l2= Language  ("Python","Backend and Software's", 18)
l3 = Language  ("C","Software's", 2)

Language.print_details(l1)
Language.print_details(l2)
l3.print_details()

l1.append_name("JavaScript",1)


