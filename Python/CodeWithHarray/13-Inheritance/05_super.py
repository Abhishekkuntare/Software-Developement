
class Dada:
    location = "Malkapur"

    def work(self):
        print(f"Dada was a Farmer !")
    
class Papa(Dada):
    location = "Amravati"

    def work(self):
        super().work()
        print(f"Papa is a Mechanical Engineer !")
  
class Child(Papa):
    location = "Dubai"

    def work(self):
        super().work()
        print(f"Child is Software Developer !")
    

d = Dada()
p = Papa()
c  = Child()

d.work()  
p.work()    
c.work() 


