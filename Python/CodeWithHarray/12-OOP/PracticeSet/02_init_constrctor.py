

class Programmer:
    Company = "Microsoft"

    def __init__(self,name,product):
        self.name = name
        self.product = product

    def getInfo(self):
        print(f"Programmer name is {self.name} and he is working on {self.product}")


abhishek = Programmer("Abhishek", "Github")
aniket = Programmer("Aniket","PowerPoint")
abhishek.getInfo()
aniket.getInfo()

