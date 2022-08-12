
class Dada:
    location = "Malkapur"
    contry = "India"

    def work(self):
        print(f"Dada was a Farmer !")
    
class Papa(Dada):
    location = "Amravati"

    def work(self):
        print(f"Papa is a Mechanical Engineer !")
    
    def garage(self):
        print("Amba motors")
    
class Child(Papa):
    # location = "Dubai"

    def work(self):
        print(f"Child is Software Developer !")
    

d = Dada()
p = Papa()
c  = Child()

# print(d.location)      
# d.work()  


# print(p.location)    
# p.work()    
print(p.contry)

# print(c.location)        
# c.work() 
# c.garage()   
print(c.location)
print(c.contry)

