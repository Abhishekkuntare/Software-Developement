

class Train:

    def __init__(self,name,fare,seats):
        self.name = name
        self.fare = fare
        self.seats = seats
    
    def getStatus(self):
        print(f"The Name of Train is: {self.name}")
        print(f"The Seates are : {self.seats}")

    def getFare(self):
        print(f"The price of the ticket is Rs: {self.fare}")
    
    def bookTicket(self):
        # print(f"{self.ticket}")
        if(self.ticket>self.seats):
            # print(self.seats)
            print("Sorry! Train is full Kindly try in tatkal")
        elif(self.ticket<self.seats):
            self.seats = self.seats - self.ticket
            # print(f"The available seats are: {self.seats}")
            print(f"Your bill is {self.fare} * {self.ticket} = {self.fare * self.ticket} and Your ticket No {self.ticket}" )
            print(f"Remaining seats are {self.seats}")
    
        
            
train = Train("Dubai bullet", 300, 100)
train.getStatus()
train.getFare()
print("\n")

ticket = int(input("How many tickets you need?: "))
train.ticket = ticket
train.bookTicket()