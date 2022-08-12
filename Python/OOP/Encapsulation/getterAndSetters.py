class Employee:
        def __init__(self,name,id, role):
            self.name = name
            self.id = id
            self.__role = role


        # setters
        def set_role(self,role_name):
                self.__role = role_name

        #getters
        def get_role(self):
            return self.__role

e1  = Employee("abhishek",1,"Software developer")
e1.set_role("App developers") # set new_role here 
data = e1.get_role() # get new_role here
print(data)
