
class Animal:
    Company ="Save Animals"
    

class Pet(Animal):
    Pets = "Dog, Cat, Birds"

class Dog(Pet):
    Dog = "Labro"

    @staticmethod
    def barkDog():
        print(f"BOW BOW BOW.......")


A = Animal()
P = Pet()
D =Dog()
D.barkDog()