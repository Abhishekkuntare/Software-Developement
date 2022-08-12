import re

 
class Authentication():
    def CheckNameAndPrint(self):
        checkName = len(self.name)
        blankName = self.name

        if(blankName == ""):
            print("Name is Required !")
        elif(not checkName <4):
            print(f"Name:- {self.name}") 
        else:
            print("Name contain at least 2 characters!")

    def CheckEmailAndPrint(self):
        regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
        blankEmail = self.email

        if(blankEmail == ""):
            print("Email is Required !")
        elif(re.fullmatch(regex,self.email)):
            print(f"Email:- {self.email}")
        else:
            print("Invalid Email!")
    
    def CheckPasswordAndPrint(self):
        checkPassword = len(self.password)
        blankPassword = self.password
        password = self.password
        hashPassword = "#@$%^&*@"
        password = password.replace(password,hashPassword)

        if(blankPassword == ""):
            print("Password is Required !")
        elif ( not checkPassword <6):
            print(f"Password:- {password}")
        else:
            print("Password contain at least 6 characters!")

    def CheckConformPasswordAndPrint(self):
        
        Password = self.password
        conformPassword = self.conformPassword
        blankConformPassword = self.conformPassword
        
        

        conformPasswordLength = len(self.conformPassword)
        
        if(blankConformPassword == ""):
            print("Conform Password is Required !")
        elif(conformPasswordLength < 6):
            print("Conform Password contain at least 6 characters !")
        elif(Password == conformPassword):
            print(f"Conform Password:- {self.conformPassword}")
        else:
            print("Conform Password does not match !")


MyAuth = Authentication()


MyAuth.name = input("Enter your Name: ")
MyAuth.email  = input("Enter your Email:- ")
MyAuth.password = input("Password:- ")
MyAuth.conformPassword = input("Conform Password:- ")

MyAuth.CheckNameAndPrint()
MyAuth.CheckEmailAndPrint()
MyAuth.CheckPasswordAndPrint()
MyAuth.CheckConformPasswordAndPrint()
