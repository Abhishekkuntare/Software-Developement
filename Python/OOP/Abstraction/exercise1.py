class Vechile:
    def __init__(self ,type,id,cost,premium_amount):
        self.type = type 
        self.id = id    
        self.cost = cost 
        self.premium_amount = premium_amount


    def vechile_Details(self):
        if(self.type !="Two Wheeler"):      
            print("Type: Invalid")
        else:
            print("Type: ", self.type)

        print("Id:",self.id,"\n","Cost:",self.cost,"\n","Premium:",self.premium_amount)

    def permium_amount_cal(self):
        print("Premium Amount: ",self.premium_amount + self.cost)

# getting user info 
v1_type = input("Enter the type of Vechile: ")
if(v1_type != "Two Wheeler"):
        print("Vehicle type is invalid")

v1_id = input("Enter the id: ")
v1_cost = int(input("Enter the cost: "))
v1_premium = int(input("Enter the premium: "))

# object and attribute sets 
v1 =Vechile(v1_type,v1_id,v1_cost,v1_premium,)


v1.vechile_Details()

Vechile.permium_amount_cal(v1)
# Vechile.vechile_Details(v1)
