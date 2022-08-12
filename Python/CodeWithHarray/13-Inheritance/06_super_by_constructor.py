
class Dada:
    location = "Malkapur"
    
    def __init__(self):
        print("Initializing Dada..........")

    
class Papa(Dada):
    location = "Amravati"

    def __init__(self):
        super().__init__()
        print("Initializing Papa...........")


class Child(Papa):
    location = "Dubai"

    def __init__(self):
        super().__init__()
        print("Initializing Child........")

d = Dada()
p = Papa()
c  = Child()


